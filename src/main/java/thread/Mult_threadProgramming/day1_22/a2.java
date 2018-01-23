package thread.Mult_threadProgramming.day1_22;

/**
 * 通过继承thread来创建新的线程
 * @author moci
 * @create 2018-01-22 2:24 PM
 **/
public class a2 extends Thread {
    @Override
    public void run(){
        super.run();
        System.out.println("MyThread");
    }
}
