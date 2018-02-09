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
    JLabel planeLab;
    JLabel shootLab;
    Icon planeImg;
    Icon shootImg;
    Point posPlane;
    Point posShoot;
    MyJframe(){
        init();
        listen();
    }

    public void init(){
        win =new JFrame();

        Plane plane = new Plane(win);
        posPlane = new Point(plane.getX(),plane.getY());

        win.setBounds(400,200,1000,1000);
        win.setVisible(true);
        win.setLayout(null);
        win.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void listen(){
        win.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int k = e.getKeyCode();
               switch (k){
                   case KeyEvent.VK_RIGHT :
                       new threadRight().start();
                       System.out.println(posPlane+"  "+posShoot);
                       break;
                   case KeyEvent.VK_LEFT:
                       new threadLeft().start();
                       System.out.println(posPlane+"  "+posShoot);
                       break;
                   case KeyEvent.VK_K:
                       new threadShoot().start();
                       System.out.println(posPlane+"  "+posShoot);
                       shootLab.setLocation(posPlane);
                       break;
                   default:break;
               }
            }
        });
    }

    public class threadRight extends Thread{
        @Override
        public void run() {
            posPlane.x = posPlane.x +5;
            planeLab.setLocation(posPlane);
            System.out.println("right!");
            System.out.println(this.getName());
        }


    }

    public class threadLeft extends Thread{
        @Override
        public void run() {
            posPlane.x = posPlane.x -5;
            planeLab.setLocation(posPlane);
            System.out.println("left!");
        }
    }

    public class threadShoot extends Thread{
        @Override
        public void run(){
            Point temp = posShoot;
            try {
                for (int i = 0; i <5; i++) {
                    temp.y -= 20;
                    sleep(300);
                    shootLab.setLocation(temp);
                    System.out.println("shoot!");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
