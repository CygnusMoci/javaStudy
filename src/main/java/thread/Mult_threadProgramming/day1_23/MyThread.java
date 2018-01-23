package thread.Mult_threadProgramming.day1_23;

/**
 * @author moci
 * @create 2018-01-23 11:05 AM
 **/
public class MyThread extends Thread {
    public void run(){
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
