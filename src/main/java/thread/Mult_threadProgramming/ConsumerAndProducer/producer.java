package thread.Mult_threadProgramming.ConsumerAndProducer;

import java.util.Stack;

/**
 * @author moci
 * @create 2018-04-10 13:37
 **/
public class producer extends Thread {
    volatile Stack<food> stack = new Stack<>();
    private String name;
    private int speed;

    producer(Stack<food> stack,String name,int speed){
        this.setName(name);
        this.stack = stack;
        this.speed = speed;
    }

    @Override
    public void run(){
        int i =0;
        while (true){
            try {
                Thread.sleep(speed*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            food foods = new food(i);
            synchronized (stack) {
                stack.push(foods);
                System.out.println("厨师:" + this.getName() + ",生产了一个,还有 【" + stack.size() + "】个.");
            }
            i++;
        }
    }
}
