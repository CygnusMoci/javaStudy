package thread.Mult_threadProgramming.day1_29.test1;

/**
 * @author moci
 * @create 2018-01-29 3:26 PM
 **/
public class MyThread extends Thread{
    private MyService service;
    public MyThread(MyService service){
        super();
        this.service =  service;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
