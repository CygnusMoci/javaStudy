package test.randForFun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 * 抽个SSR试试吧
 * @author moci
 * @create 2018-01-15 12:01 PM
 **/
public class getCard extends JFrame implements ActionListener {
    public static int getTime = 0;
    public static int mutTime = 0;

    public static final double ssrRate = 2.0;
    public static int ssrNum = 0;

    public static final double srRate = 9.2;
    public static int srNum = 0;

    public static final double rRate = 88.8;
    public static int rNum = 0;

//    public static final double nRate = 3.0;




    getCard(){
        JFrame jFrame = new JFrame();
        JButton b1 = new JButton("单抽");
        JButton b2 = new JButton("十连抽");
        JPanel p1 = new JPanel();
        JTextArea jt = new JTextArea();

        jFrame.add(p1);
        jFrame.setLayout(new FlowLayout());
        p1.add(b1);
        p1.add(b2);
        p1.add(jt);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s =e.getActionCommand();
                if(s.equals("单抽")){
                    soloGet();
                    showResult();
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s =e.getActionCommand();
                if(s.equals("十连抽")){
                    mutiGet();
                    showResult();
                }
            }
        });

        jFrame.setTitle("恋与制作人抽奖模拟");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setSize(250,100);
        jFrame.setLocation(400,200);

        Scanner sc = new Scanner(System.in);
        System.out.println("点击按钮，进行抽奖！");
        while (sc.hasNext()){
            String str = sc.nextLine();
            soloGet();
        }

    }

    /**
     * 单抽
     */
    private static void soloGet(){
        double rand = 100*Math.random();
        if(rand>0&&rand<=ssrRate){
            System.out.println("恭喜你抽中了SSR！");
            ssrNum++;
        }else if (rand>ssrRate&&rand<=srRate+ssrRate){
            System.out.println("恭喜你抽中了SR！");
            srNum++;
        }else if(rand>srRate+ssrRate&&rand<=rRate+srRate+ssrRate){
            System.out.println("恭喜你抽中了R！");
            rNum++;
        }else {
            System.out.println("抽奖出错了!");
        }
        getTime++;
    }

    /**
     * 十连抽 带保底
     */
    private static void mutiGet(){
        int temp =srNum;
        for (int i = 0; i <10 ; i++) {
            soloGet();
        }
        if(temp ==srNum){
            System.out.println("恭喜你抽中了SR！");
            srNum++;
            mutTime++;
        }else{
            soloGet();
        }
    }

    public void actionPerformed(ActionEvent e) {
        String s =e.getActionCommand();
        if(s.equals("点我")){
            soloGet();
        }
    }

    public static void showResult(){
        System.out.println("抽奖结束！ 谢谢光临！");
        System.out.println("结果统计:");
        System.out.println("-------------------");
        System.out.println("|SSR: "+ssrNum+"  <<<");
        System.out.println("-------------------");
        System.out.println("|SR: "+srNum+"  <<<");
        System.out.println("-------------------");
        System.out.println("|R: "+rNum+"  <<<");
        System.out.println("-------------------");
        System.out.println("|抽奖次数: "+getTime+"  <<<");
        System.out.println("-------------------");
        System.out.println("|保底次数: "+mutTime+"  <<<");
        System.out.println("-------------------");
    }
}
