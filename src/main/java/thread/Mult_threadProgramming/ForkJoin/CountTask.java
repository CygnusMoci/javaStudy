package thread.Mult_threadProgramming.ForkJoin;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author moci
 * @create 2018-05-06 13:39
 **/
public class CountTask extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 2; //阈值
    private int start;
    private int end;
    public CountTask(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;

        //如果任务足够小就计算任务
        boolean canCompute = (end-start)<=THRESHOLD;
        if(canCompute){
            for (int i = start; i <end ; i++) {
                sum+=i;
            }
        }else{
            int middle = (start + end)/2;
            CountTask leftTask = new CountTask(start,middle);
            CountTask rightTask = new CountTask(middle+1,end);
            //执行子任务
            leftTask.fork();
            rightTask.fork();

            int leftResult = leftTask.join();
            int rightResult = rightTask.join();
            //合并子任务
            sum = leftResult + rightResult;
        }

        return sum;
    }


    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        CountTask task = new CountTask(1,108);
        Future<Integer> result = pool.submit(task);

        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            System.out.println("发生了中断异常");
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
