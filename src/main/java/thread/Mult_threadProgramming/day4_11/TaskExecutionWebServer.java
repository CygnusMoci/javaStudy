package thread.Mult_threadProgramming.day4_11;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 基于线程池的web
 * @author moci
 * @create 2018-04-12 15:17
 **/
public class TaskExecutionWebServer {
    private static final int NTHREADS = 100;
    private static final Executor exec  = Executors.newFixedThreadPool(NTHREADS);

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9090);
        while (true){
            final Socket connection = ss.accept();
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    handleRequest(connection);
                }
            };
            exec.execute(task);
        }
    }


    public static void handleRequest(Socket socket){
        System.out.println("触发handleRequest");
    }
}
