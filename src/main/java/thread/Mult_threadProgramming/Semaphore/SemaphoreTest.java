package thread.Mult_threadProgramming.Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author moci
 * @create 2018-05-07 13:31
 **/
public class SemaphoreTest {
    //有30个程序在执行
    private static final int THREAD_COUNT = 30;
    private static ExecutorService threadPool =Executors.newFixedThreadPool(THREAD_COUNT);
    //通过Semaphore限制只有10个可以并发执行
    private static Semaphore s = new Semaphore(10);

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        //请求与释放
                        s.acquire();
                        System.out.println(Thread.currentThread().getName()+"保存数据");
                        s.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        //关闭线程池
        threadPool.shutdown();
    }
}
