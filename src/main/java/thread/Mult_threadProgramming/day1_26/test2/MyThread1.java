package thread.Mult_threadProgramming.day1_26.test2;


/**
 * @author moci
 * @create 2018-01-26 10:55 AM
 **/
public class MyThread1 extends Thread {
    private Object lock;
    public MyThread1(Object lock){
        super();
        this.lock = lock;
    }

    public void run(){
        try {
            synchronized (lock){
                System.out.println("开始等待" + System.currentTimeMillis());
                lock.wait();
                System.out.println("等待结束"+ System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
