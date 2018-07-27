package thread.Mult_threadProgramming.day4_16;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/**
 * 增加了日志等功能的线程池
 * @author moci
 * @create 2018-04-16 16:25
 **/
public class TimingThreadPool extends ThreadPoolExecutor {

    private final ThreadLocal<Long> startTime = new ThreadLocal<>();
    private final Logger log = Logger.getLogger("TimingThreadPool");
    private final AtomicLong numTasks = new AtomicLong();
    private final AtomicLong totalTime = new AtomicLong();

    @Override
    protected void beforeExecute(Thread t,Runnable r){
        super.beforeExecute(t,r);
        log.fine(String.format("Thread %s:start %s",t,r));
        startTime.set(System.nanoTime());
    }

    @Override
    protected void afterExecute(Runnable r , Throwable t){
        try {
            long endTime = System.nanoTime();
            long taskTime = endTime - startTime.get();
            numTasks.incrementAndGet();
            totalTime.addAndGet(taskTime);
            log.fine(String.format("Thread %s:end %s,time = %dns",t,r,taskTime));
        }finally {
            super.afterExecute(r,t);
        }
    }

    /**
     * 终止之后
     */
    @Override
    protected void terminated(){
        try {
            log.info(String.format("Terminated: avg time = %dns",totalTime.get()/numTasks.get()));
        }finally {
            super.terminated();
        }
    }


    /**
     * 构造函数
     * @param corePoolSize
     * @param maximumPoolSize
     * @param keepAliveTime
     * @param unit
     * @param workQueue
     */
    public TimingThreadPool(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

}
