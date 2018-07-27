package thread.Mult_threadProgramming.faitAndUnfairLock;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 公平锁与非公平锁输出比较
 * @author moci
 * @create 2018-05-03 13:35
 **/
public class FairAndUnfairTest {
    private static Lock fairLock = new ReentrantLock2(true); //公平锁
    private static Lock unfairLock = new ReentrantLock2(false); //非公平锁

    @Test
    public void fair(){
        tastLock(fairLock);
    }

    @Test
    public void unfair(){
        tastLock(unfairLock);
    }


    private void tastLock(Lock lock){
        for (int i = 0; i < 5; i++) {
            new Job(lock).start();
        }
    }

    private static class Job extends Thread{
        private Lock lock;
        public Job(Lock loc){
            this.lock = loc;
        }
        @Override
        public void run(){
            System.out.println("当前线程名字："+Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getStackTrace());
        }
    }

    private static class ReentrantLock2 extends ReentrantLock{
        public ReentrantLock2(boolean fair){
            super(fair);
        }

        @Override
        public Collection<Thread> getQueuedThreads(){
            List<Thread> arrayList = new ArrayList<>(super.getQueuedThreads());
            Collections.reverse(arrayList);
            return  arrayList;
        }

    }

}
