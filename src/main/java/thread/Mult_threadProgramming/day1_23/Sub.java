package thread.Mult_threadProgramming.day1_23;

/**
 * @author moci
 * @create 2018-01-23 11:04 AM
 **/
public class Sub extends Main {
    synchronized public void operateISubMethod(){
        try {
            while (i>0){
                i--;
                System.out.println("sub print i = " + i);
                Thread.sleep(100);
                this.operateIMainMethod();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
