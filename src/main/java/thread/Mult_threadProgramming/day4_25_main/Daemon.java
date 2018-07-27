package thread.Mult_threadProgramming.day4_25_main;

import java.util.concurrent.TimeUnit;

/**
 * @author moci
 * @create 2018-04-25 12:52
 **/
public class Daemon {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(),"守护线程");
        thread.setDaemon(true);
        thread.start();

    }

    static class DaemonRunner implements Runnable{

        @Override
        public void run(){
            try {
                SleepUtils.second(10);
            }finally {
                System.out.println("守护线程最终执行了!");
            }
        }
    }

    static class mythread implements Runnable{
        @Override
        public void run(){
            System.out.println("运行中");
        }
    }

    static class SleepUtils{
        public static final void second(long secondes){
            try {
                TimeUnit.SECONDS.sleep(secondes);
            } catch (InterruptedException e) {
            }
        }
    }
}
