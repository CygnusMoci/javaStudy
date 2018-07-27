package thread.Mult_threadProgramming.day4_9;

/**
 * @author moci
 * @create 2018-04-09 19:31
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        BetterVector<String> a = new BetterVector<>();
        new Thread(new myThread(a)).start();
        new Thread(new myThread(a)).start();
        Thread.sleep(2);
        System.out.println(a);
    }
}
