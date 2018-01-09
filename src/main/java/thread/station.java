package thread;

/**
 * @author moci
 * @create 2017-12-29 11:02 AM
 **/
public class station extends Thread{

    private static int ticket = 60;
    private static Object key = "aa";
    public void run(){
        while(ticket>0){
            synchronized (key){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() +
                            " is saling ticket" + ticket--);
                }else{
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
