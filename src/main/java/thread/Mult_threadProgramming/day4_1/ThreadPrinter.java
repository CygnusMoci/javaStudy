package thread.Mult_threadProgramming.day4_1;

import java.util.Date;

/**
 * @author moci
 * @create 2018-04-01 13:06
 **/
public class ThreadPrinter extends Thread {
    private  int pauseTime;
    private   String name;

    ThreadPrinter(int x, String str){
        this.pauseTime = x;
        this.name = str;
    }
    @Override
    public void run(){
        while (true){
            try {
                System.out.println(name + ":" + new Date(System.currentTimeMillis()));
                Thread.sleep(pauseTime);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadPrinter t1 = new ThreadPrinter(1000,"fast");
        t1.start();
        ThreadPrinter t2 = new ThreadPrinter(3000,"slow");
        t2.start();
    }
}
