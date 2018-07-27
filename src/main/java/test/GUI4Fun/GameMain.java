package test.GUI4Fun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author moci
 * @create 2018-04-16 20:29
 **/
public class GameMain extends JFrame  {
    GameMain(){
        JFrame jf = new JFrame("Game");
        JPanel jp = new JPanel();
        jf.add(jp);

        JLabel block = new JLabel();
        Icon blockIcon = new ImageIcon(getClass().getResource("/block.png"));

        JLabel player = new JLabel();
        Icon playerIcon =new ImageIcon(getClass().getResource("/Player.png"));
        Button bt = new Button();

        block.setIcon(blockIcon);
        player.setIcon(playerIcon);
        jp.add(block);
        jp.add(player);
        jp.setLayout(null);
        player.setBounds(100,500,100,100);
        block.setBounds(400,400,200,200);

        jf.setSize(800,800);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.addMouseListener(new MouseAdapter() {
            int score = 0;
            @Override
            public void mousePressed(MouseEvent e) {
                if(isContact(player,block)) System.out.println("得分:" + (++score));
                int x = e.getX();
                int y = e.getY();
                int xx = x-player.getWidth()/2-15;
                int yy = y-player.getHeight()/2-30;
                player.setBounds(xx,yy,80,70);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                int xx = x-player.getWidth()/2-25;
                int yy = y-player.getHeight()/2-50;
                player.setBounds(xx,yy,100,100);
            }
        });

        jf.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                int xx = x-player.getWidth()/2-15;
                int yy = y-player.getHeight()/2-40;
                player.setBounds(xx,yy,100,100);
            }
        });

        if(isContact(player,block)) System.out.println("碰撞");

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage("");
        Cursor dynamiteCuror = kit.createCustomCursor(img, new Point(10,10),"") ;
        jf.setCursor(dynamiteCuror);


    }
    public boolean isContact(JLabel j1,JLabel j2){
        int x1 = j1.getX();
        int y1 = j1.getY();
        int x2 = j2.getX();
        int y2 = j2.getY();

        int width1 = j1.getWidth();
        int height1= j1.getHeight();

        int width2 = j2.getWidth();
        int height2 = j2.getHeight();
        if((Math.abs(x1-x2)<(width1+width2)/2)&&(Math.abs(y1-y2)<(height1+height2)/2)){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        new GameMain();
    }

}
