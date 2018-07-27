package thread.Mult_threadProgramming.day4_17;

/**
 * @author moci
 * @create 2018-04-17 13:42
 **/
public class LeftRightDeadLock {
    private final Object left = new Object();
    protected final Object right = new Object();
    public void leftRight(){
        synchronized (left){
            synchronized (right){
                System.out.println("/*****leftRight*****/");
            }
        }
    }
    public void rightLeft(){
        synchronized (right){
            synchronized (left){
                System.out.println("/*****leftRight*****/");
            }
        }
    }


}
