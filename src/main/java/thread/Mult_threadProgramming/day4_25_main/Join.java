package thread.Mult_threadProgramming.day4_25_main;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * @author moci
 * @create 2018-04-25 14:22
 **/
public class Join {
    public static void main(String[] args) throws Exception {
        Thread previous = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Domino(previous),String.valueOf(i));
            thread.start();
            previous = thread;
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println(Thread.currentThread().getName()+
                            "终止(Main)");
    }

    static  class Domino implements Runnable{
        private Thread thread;
        public Domino(Thread thread){
            this.thread = thread;
        }

        @Override
        public void run() {
            try{
                thread.join();
            }catch (InterruptedException e){
            }

            System.out.println(Thread.currentThread().getName() +
                    "终止");
        }
    }
}
