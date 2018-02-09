package thread.Mult_threadProgramming.day1_26.test2;

/**
 * @author moci
 * @create 2018-01-26 11:03 AM
 **/
public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 my1 = new MyThread1(lock);
            my1.start();
            Thread.sleep(3000);
            MyThread2 my2 = new MyThread2(lock);
            my2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
