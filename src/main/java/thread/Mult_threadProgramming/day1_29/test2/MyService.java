package thread.Mult_threadProgramming.day1_29.test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author moci
 * @create 2018-01-29 4:14 PM
 **/
public class MyService {
    private Lock lock = new ReentrantLock();
    public Condition condition = lock.newCondition();
    public void await() {
         try {
             lock.lock();
             System.out.println("await的时间为 = "+System.currentTimeMillis());
             condition.await();
         } catch(InterruptedException e){
             e.printStackTrace();
         } finally {
             lock.unlock();
         }
    }

    public void signal(){
        try {

            lock.lock();
            System.out.println("siganl的时间为 = "+System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
        }
    }
}
