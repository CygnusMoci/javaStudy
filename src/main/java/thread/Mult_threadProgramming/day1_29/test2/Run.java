package thread.Mult_threadProgramming.day1_29.test2;

/**
 * @author moci
 * @create 2018-01-29 4:19 PM
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
        Thread.sleep(3000);
        service.signal();

    }
}
