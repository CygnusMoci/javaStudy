package thread.Mult_threadProgramming.BlockingQueue;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * 有两个线程A,B,  A线程每200ms就生成一个[0,100]之间的随机数， B线程每2S中打印出A线程所产生的增量随机数。
 * @author moci
 * @create 2018-05-09 15:21
 **/
public class BlockingQueueTest {
    //初始化一个10容量的链表阻塞队列
    private static BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(10);

    public static void main(String[] args) {
        //创建线程池
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);

        Random random = new Random();

        ses.scheduleAtFixedRate(() ->  {
            //101为上界 保证0-100
            int value = random.nextInt(101);
            try{
                blockingQueue.offer(value);  //offer()方法就是网队列的尾部设置值
            }catch(Exception ex){
                ex.printStackTrace();
            }
        },0,200,TimeUnit.MILLISECONDS);

        new Thread(() -> {
            while (true){
                try {
                    Thread.sleep(2000);
                    System.out.println("开始取值");
                    List<Integer> list = new LinkedList<>();
                    //drainTo()将队列中的值全部从队列中移除，并赋值给对应集合
                    blockingQueue.drainTo(list);
                    list.forEach(System.out::println);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
