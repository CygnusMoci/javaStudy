package thread.Mult_threadProgramming.day4_10;

import javax.sound.midi.Soundbank;
import java.util.concurrent.CountDownLatch;

/**
 * @author moci
 * @create 2018-04-11 13:26
 **/
public class TestHarness {

    public static void main(String[] args) {
        final Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("task运行啦！");
            }
        };

        try {
            System.out.println(timeTasks(5,task));
        } catch (InterruptedException e) {
            System.out.println("发出了一个InterruptedException!");
        }
    }

    public static long timeTasks(int nThreads,final Runnable task) throws InterruptedException{
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread(){
                public void run(){
                    try {
                        startGate.await();
                        try {
                            task.run();
                        }finally {
                            endGate.countDown();
                        }
                    } catch (InterruptedException e ){ }
                }
            };
            t.start();
        }

        long start = System.nanoTime();
        startGate.countDown();
        endGate.await();
        long end = System.nanoTime();
        return end - start;
    }
}
