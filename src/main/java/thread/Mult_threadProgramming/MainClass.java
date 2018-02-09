package thread.Mult_threadProgramming;

/**
 * @author moci
 * @create 2018-01-22 2:19 PM
 **/
public class MainClass {
    static  int a =0;
    public static void main(String[] args) throws InterruptedException {
        tre tre = new tre();
        while (true){
            Thread.sleep(500);
            new Thread(tre).start();
            new Thread(tre).start();
            System.out.println();
        }
    }

    public static class tre extends Thread {
        private String name;
         public void run(){
            foo();
        }

        void foo() {
            if(a <= 0) a++; else a--;

            System.out.println(Thread.currentThread().getName()+"    "+a);
        }
    }
}
