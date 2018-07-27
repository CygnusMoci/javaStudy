package thread.Mult_threadProgramming.joinTest;

/**
 * @author moci
 * @create 2018-04-27 14:53
 **/
public class joinThread implements Runnable {
    private String context;
    joinThread(String context){
        this.context = context;
    }

    @Override
    public void run() {
        System.out.println(context);
    }
}
