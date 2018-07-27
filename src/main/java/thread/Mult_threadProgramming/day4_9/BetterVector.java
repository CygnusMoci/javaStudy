package thread.Mult_threadProgramming.day4_9;

import java.util.Vector;

/**
 * @author moci
 * @create 2018-04-09 19:29
 **/
public class BetterVector<E> extends Vector {
    public synchronized boolean putIfAbsent(E x){
        boolean absent = !contains(x);
        if(absent){
            add(x);
        }
        return absent;
    }
}
