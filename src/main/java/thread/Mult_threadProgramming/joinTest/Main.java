package thread.Mult_threadProgramming.joinTest;

/**
 * @author moci
 * @create 2018-04-27 14:53
 **/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] arr  = new String[100];
        for (int i = 0; i < 100; i++) {
            arr[i] ="我是第"+ i+"个线程  ";
            Thread t1 = new Thread(new joinThread(arr[i]));
            t1.start();
            t1.join();
        }
        System.out.println("结束");
    }
}
