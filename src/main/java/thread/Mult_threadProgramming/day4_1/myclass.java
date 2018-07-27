package thread.Mult_threadProgramming.day4_1;

/**
 * @author moci
 * @create 2018-04-01 13:05
 **/
public class myclass {

       public static void   main(String[] args) {
           int [] f = {1};
           thread1 t1 = new thread1(f[0]);
           Thread a = new Thread(t1);
           Thread c = new Thread(t1);
           a.start();
           c.start();
           System.out.println(f[0]);
    }
}
