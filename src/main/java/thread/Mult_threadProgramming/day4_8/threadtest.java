package thread.Mult_threadProgramming.day4_8;

/**
 * @author moci
 * @create 2018-04-08 13:22
 **/
public class threadtest {
    private volatile static int num;
    private static boolean ready;
    private static int i =0;
    public static class go extends Thread{
        @Override
        synchronized public void run(){
            System.out.println(num);
            System.out.print(  "*********"+(i=i+1)+"*********");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <100 ; i++) {
            num = i;
            new go().start();
        }

    }
}
