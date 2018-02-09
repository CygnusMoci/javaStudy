package thread.Mult_threadProgramming.day1_26.test1;

/**
 * @author moci
 * @create 2018-01-26 10:43 AM
 **/
public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("syn上面");
            synchronized (lock){
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait下面");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("wait了");
        }
    }
}
