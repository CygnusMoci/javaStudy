package thread.Mult_threadProgramming.day4_25_main;

import java.util.concurrent.TimeUnit;

/**
 * 两种方式中断线程
 * @author moci
 * @create 2018-04-25 13:17
 **/
public class shutDown {
    public static void main(String[] args) throws Exception{
        Runner one = new Runner();
        Thread countThread = new Thread(one,"countThread");
        countThread.start();

        TimeUnit.SECONDS.sleep(1);
        Thread.yield();
        countThread.interrupt();

        Runner two = new Runner();
        countThread = new Thread(two,"countThread");
        countThread.start();
        TimeUnit.SECONDS.sleep(1);
        two.cancel();

    }

    static class Runner implements Runnable{
        private long i;
        private volatile boolean on = true;
        @Override
        public void run() {
            while (on&&!Thread.currentThread().isInterrupted()){
                i++;
            }
            System.out.println("Count i = "+ i );
        }
        public void cancel(){
            on = false;
        }
    }
}
