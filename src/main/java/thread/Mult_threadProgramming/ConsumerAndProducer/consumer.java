package thread.Mult_threadProgramming.ConsumerAndProducer;

import java.util.Stack;

/**
 * @author moci
 * @create 2018-04-10 12:06
 **/
public class consumer extends Thread {
    volatile  Stack<food> stack = new Stack<>();
    private String name;
    private int speed;

    consumer(Stack<food> stack, String name,int speed){
        this.setName(name);
        this.stack = stack;
        this.speed = speed;
    }

    @Override
     public void run(){
            int i =0;
            while (true){
                if(stack.size()>0){
                    synchronized (stack){
                        stack.pop();
                        System.out.println("客人:" + this.getName() + "吃了一个，还剩 【"+stack.size()+"】个。");
                    }
                  }else {
                    System.out.println("现在没有食物。");
                }

                try {
                    Thread.sleep(speed*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}
