package thread.Mult_threadProgramming.day1_23;

/**
 * @author moci
 * @create 2018-01-23 11:01 AM
 **/
public class Main {
    public int i =11;
    synchronized public void operateIMainMethod(){
        try {
            i--;
            System.out.println("main print i= " + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
