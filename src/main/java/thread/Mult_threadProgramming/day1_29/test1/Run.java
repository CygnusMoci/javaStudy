package thread.Mult_threadProgramming.day1_29.test1;

/**
 * @author moci
 * @create 2018-01-29 3:28 PM
 **/
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        new MyThread(service).start();
        new MyThread(service).start();
        new MyThread(service).start();
        new MyThread(service).start();
        new MyThread(service).start();
        new MyThread(service).start();
        new MyThread(service).start();
        new MyThread(service).start();
        new MyThread(service).start();
    }
}
