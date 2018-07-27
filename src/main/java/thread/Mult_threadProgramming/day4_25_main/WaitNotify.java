package thread.Mult_threadProgramming.day4_25_main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 等待/通知经典范式
 * @author moci
 * @create 2018-04-25 13:42
 **/
public class WaitNotify {
    static boolean flag = true;
    static Object lock = new Object();

    public static void main(String[] args) throws Exception{
        Thread waitThread = new Thread(new Wait(),"等待线程");
        waitThread.start();
        TimeUnit.SECONDS.sleep(1);
        Thread notifyThread = new Thread(new Notify(),"通知线程");
        notifyThread.start();
    }

    static class Wait implements Runnable{

        @Override
        public void run() {
            synchronized (lock){
                while (flag){
                    try {
                        System.out.println(Thread.currentThread() + "flag is true. wait@ " +
                                new SimpleDateFormat("HH:mm:ss").format(new Date()));
                        lock.wait(); //wait会释放锁，所以后面的Notify线程才能获得锁
                    }catch (InterruptedException e){
                    }
                }
                //条件满足的时候开始输入以下
                System.out.println(Thread.currentThread() +
                                    "flag is false. running@ " +
                                    new SimpleDateFormat("HH:mm:ss").format(new Date()));

            }
        }
    }

    private static class Notify implements Runnable{
        @Override
        public void run() {
            //加锁，拥有Lock的Monitor
            synchronized (lock){
                System.out.println(Thread.currentThread() +
                        "hold lock. notify@  " +
                        new SimpleDateFormat("HH:mm:ss").format(new Date()));
                lock.notifyAll();
                flag = false;
                Daemon.SleepUtils.second(5);
            }
            synchronized (lock){
                System.out.println(Thread.currentThread() +
                        "hold lock again. sleep@   " +
                        new SimpleDateFormat("HH:mm:ss").format(new Date()));
                Daemon.SleepUtils.second(5);
            }
        }
    }
}
