package thread.Mult_threadProgramming.day1_29.test2;

/**
 * @author moci
 * @create 2018-01-29 4:17 PM
 **/
public class ThreadA extends Thread {
    private MyService myService = new MyService();
    public ThreadA(MyService myService){
        super();
        this.myService = myService;
    }

    @Override
    public void run(){
        myService.await();
    }
}
