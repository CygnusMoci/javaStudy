package thread.Mult_threadProgramming.Condition;

import java.awt.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author moci
 * @create 2018-05-03 15:58
 **/
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await(){
        try {
            lock.lock();
            System.out.println("await时间为：" + System.currentTimeMillis());
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signal(){
        try {
            lock.lock();
            System.out.println("signal时间为：" + System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }
    }

    static class ThreadA extends Thread{
        private MyService myService;
        public ThreadA(MyService myService){
            this.myService = myService;
        }

        @Override
        public void run(){
            myService.await();
        }
    }

    public static void main(String[] args) throws Exception{
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();
    }
}
