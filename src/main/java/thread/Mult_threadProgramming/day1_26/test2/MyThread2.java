package thread.Mult_threadProgramming.day1_26.test2;

/**
 * @author moci
 * @create 2018-01-26 11:00 AM
 **/
public class MyThread2 extends Thread {
    private Object lock;
    public MyThread2(Object lock){
        super();
        this.lock = lock;
    }

    public void  run(){
        synchronized (lock){
            System.out.println("开始等待" + System.currentTimeMillis());
            lock.notify();
            System.out.println("等待结束"+ System.currentTimeMillis());
        }
    }
}
