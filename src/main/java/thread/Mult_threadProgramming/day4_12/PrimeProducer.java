package thread.Mult_threadProgramming.day4_12;

import java.math.BigInteger;
import java.util.concurrent.BlockingQueue;

/**
 * @author moci
 * @create 2018-04-13 15:56
 **/
public class PrimeProducer extends Thread {
    private final BlockingQueue<BigInteger> queue;

    PrimeProducer(BlockingQueue<BigInteger> queue){
        this.queue =queue;
    }

    @Override
    public void run(){
        try {
            BigInteger  p = BigInteger.ONE;
            while (!Thread.currentThread().isInterrupted()){
                queue.put( p = p.nextProbablePrime());
            }
        }catch (InterruptedException e){
            /* 允许线程退出 */
        }
    }

    public void cancel(){interrupt();}
}
