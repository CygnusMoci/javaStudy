package thread.Mult_threadProgramming.day4_25_main;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * ThreadLocal的使用
 * @author moci
 * @create 2018-04-25 14:55
 **/
public class Profiler {
    private static  final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>(){
        protected Long initialValue(){
            return System.currentTimeMillis();
        }
    };

    public static final void begin(){
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }

    public static final Long end(){
        return System.currentTimeMillis()-TIME_THREADLOCAL.get();
    }

    public static void main(String[] args) throws Exception {
        Profiler.begin();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Cost: " + Profiler.end() + "mills");
    }
}
