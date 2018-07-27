package thread.Mult_threadProgramming;

import org.testng.internal.thread.ExecutorAdapter;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author moci
 * @create 2018-01-22 2:19 PM
 **/
public class MainClass {
    volatile static int a =0;

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        th thread1 = new th(a);
        for (int i = 0; i < 5; i++) {
            a++;
            es.execute(thread1);
        }
        es.shutdown();
        System.out.println(a);
    }

    static class th implements Runnable{
        private volatile int a;

        public th(int a){
            this.a = a;
        }
        @Override
        public void run() {
            System.out.println(a);
        }
    }
}
