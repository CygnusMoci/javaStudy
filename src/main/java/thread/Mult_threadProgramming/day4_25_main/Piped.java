package thread.Mult_threadProgramming.day4_25_main;

import java.io.*;

/**
 * @author moci
 * @create 2018-04-25 14:05
 **/
public class Piped {

    public static void main(String[] args) throws Exception {
        PipedReader in = new PipedReader();
        PipedWriter out = new PipedWriter();
        out.connect(in);
        Thread printThread = new Thread(new Print(in),"打印线程");
        printThread.start();
        int receive = 0;
        try {
            while((receive = System.in.read())!= -1){
                out.write(receive);
            }
        }finally {
            out.close();
        }

    }



    static class Print implements Runnable{

        private PipedReader in ;

        public Print(PipedReader in ){
            this.in = in;
        }

        @Override
        public void run() {
            int receive = 0;
            try {
                while ((receive = in.read())!= -1){
                    System.out.print((char)receive);
                }
            }catch (IOException e){
            }
        }
    }
}
