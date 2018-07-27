package thread.Mult_threadProgramming.day4_11;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 利用线程池模拟心跳
 * @author moci
 * @create 2018-04-12 16:56
 **/
public class HeartBeat {
    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(5);
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("HeartBeat`````````````");
            }
        };

        ses.scheduleAtFixedRate(task,5,3, TimeUnit.SECONDS);

    }


}
