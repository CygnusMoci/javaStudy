package thread.Mult_threadProgramming.day4_25_main.ConPool;

import java.sql.Connection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author moci
 * @create 2018-04-25 15:31
 **/
public class ConnectionPoolTest {
    static ConnectionPool pool = new ConnectionPool(10);
    static CountDownLatch start = new CountDownLatch(1);
    static CountDownLatch end;

    public static void main(String[] args) throws Exception{
        //线程数量
        int threadCount = 11;
        end = new CountDownLatch(threadCount);
        int count = 20;
        AtomicInteger got = new AtomicInteger();
        AtomicInteger notgot = new AtomicInteger();
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(new ConnectionRuner(count,got,notgot),
                    "链接运行的进程");
            thread.start();
        }

        start.countDown();
        end.await();
        System.out.println("total invoke: " + (threadCount*count));
        System.out.println("got connection: " + got);
        System.out.println("notgot connection: " + notgot);
    }

    static class ConnectionRuner implements Runnable{
        int count ;
        AtomicInteger got;
        AtomicInteger notgot;

        public ConnectionRuner(int count, AtomicInteger got, AtomicInteger notgot) {
            this.count = count;
            this.got = got;
            this.notgot = notgot;
        }

        @Override
        public void run() {
            try {
                start.await();
            }catch (Exception ex){
            }
            while (count>0){
                try {
                    //从线程池获得链接，如果超过1000ms无法获取，将返回null
                    //分布统计连接获取的数量got和未获取到的数量notgot
                    Connection connection = pool.fetchConnextion(1000);
                    if(connection != null){
                        try {
                            connection.createStatement();
                            connection.commit();
                        }finally {
                            pool.releaseConnextion(connection);
                            got.incrementAndGet();
                        }
                    }else{
                        notgot.incrementAndGet();
                    }
                }catch (Exception ex){
                }finally {
                    count--;
                }
            }

            end.countDown();
        }
    }
}
