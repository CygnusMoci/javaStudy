package thread.Mult_threadProgramming.ConsumerAndProducer;

import java.util.Stack;

/**
 * @author moci
 * @create 2018-04-10 12:07
 **/
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Stack<food> stack = new Stack<>();
        new consumer(stack,"张三",3).start();
        new consumer(stack,"李四",4).start();
        new producer(stack,"AA",1).start();
        new producer(stack,"BB",2).start();
    }
}
