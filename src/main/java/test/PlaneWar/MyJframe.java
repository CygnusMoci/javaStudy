package test.PlaneWar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author moci
 * @create 2018-01-23 3:02 PM
 **/
public class MyJframe extends JFrame {
    JFrame win;
    JLabel jLabel;
    Icon plane;
    JLabel shoot;
    Icon shootImg;
    Point pos;
    Point posShoot;
    MyJframe(){
        init();
        threadA a =new threadA();
        threadB b =new threadB();
        a.start();
        b.start();
    }

    public void init(){
        win =new JFrame();
        jLabel =new JLabel();
        shoot =new JLabel();

        plane = new ImageIcon(getClass().getResource("/plane.png"));
        shootImg = new ImageIcon(getClass().getResource("/shoot.png"));

        jLabel.setLocation(350,400);
        pos = jLabel.getLocation();

        jLabel.setSize(plane.getIconWidth(),plane.getIconHeight());
        shoot.setSize(shootImg.getIconWidth(),shootImg.getIconHeight());

        shoot.setLocation(pos);
        posShoot = shoot.getLocation();

        jLabel.setIcon(plane);
        shoot.setIcon(shootImg);

        win.setBounds(400,200,800,600);
        win.setVisible(true);
        win.add(jLabel);
        win.add(shoot);
        win.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    public class threadB extends Thread{
        @Override
        public void run() {
            win.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    int k = e.getKeyCode();
                    if(k==KeyEvent.VK_RIGHT){
                        pos.x = pos.x +5;
                    }else if(k==KeyEvent.VK_LEFT){
                        pos.x = pos.x -5;
                    }
                    jLabel.setLocation(pos);
                    shoot.setLocation(pos);
                }
            });
        }
    }

    public class threadA extends Thread{
        @Override
        public void run() {
            win.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    int k = e.getKeyCode();
                    if(k==KeyEvent.VK_K) {
                        for (int i = 0; i <50; i++) {
                            posShoot.y-=1;
                            try {
                                sleep(100);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                            shoot.setLocation(posShoot);
                        }

                        System.out.println(posShoot.y);
                    }
                }
            });
            shoot.setLocation(pos);
        }
    }





}
