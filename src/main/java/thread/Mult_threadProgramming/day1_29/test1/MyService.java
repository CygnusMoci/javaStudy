package thread.Mult_threadProgramming.day1_29.test1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author moci
 * @create 2018-01-29 3:23 PM
 **/
public class MyService {
    private Lock lock = new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("县城名称 = " +Thread.currentThread().getName()+(" " + (i+1)));
        }
        lock.unlock();
    }
}
