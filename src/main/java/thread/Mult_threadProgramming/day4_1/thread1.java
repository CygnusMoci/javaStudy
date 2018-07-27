package thread.Mult_threadProgramming.day4_1;

/**
 * @author moci
 * @create 2018-04-01 16:30
 **/
public class thread1 implements Runnable {
    private int i = 0;
    thread1(int x){
        this.i = x;
    }
    @Override
    public void run() {
        i++;
        i++;
    }
}
