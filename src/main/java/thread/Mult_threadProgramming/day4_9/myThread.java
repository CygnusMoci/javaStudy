package thread.Mult_threadProgramming.day4_9;

/**
 * @author moci
 * @create 2018-04-09 19:30
 **/
public class myThread implements Runnable {
    BetterVector<String> a = new BetterVector<>();
    myThread( BetterVector<String> a){
        this.a = a;
    }
    @Override
    public void run() {
        String sum ="";
        for (int i = 1; i <11; i++) {
            sum+=i;
            a.putIfAbsent(sum);
        }
    }
}
