package thread.Mult_threadProgramming.abcabcabc;

import thread.Mult_threadProgramming.day1_23.Run;
import thread.Mult_threadProgramming.day4_9.myThread;

/**
 * 循环打印abc的N种写法，这里主要考查多线程唤醒机制。
 * 第一种，双重synchronized
 * @author moci
 * @create 2018-05-15 19:34
 **/
public class abc_1 implements Runnable{
    String name;
    Object prev;
    Object self;
    Thread thread;

    abc_1(String name,Object prev,Object self){
        this.name = name;
        this.prev = prev;
        this.self = self;
        this.thread = new Thread(this,name);
    }
    @Override
    public void run() {
        int count = 3;
        while (count > 0) {
            synchronized (prev){
                synchronized (self){
                    System.out.print(name);
                    count--;
                    //执行完此synchronized才释放锁
                    self.notify();
                }
                try {
                    //释放prev
                    prev.wait();
                }catch (InterruptedException e){
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Object ob1 =new Object();
        Object ob2 =new Object();
        Object ob3 =new Object();

        abc_1 t1 = new abc_1("a",ob3,ob1);
        abc_1 t2 = new abc_1("b",ob1,ob2);
        abc_1 t3 = new abc_1("c",ob2,ob3);
        t1.thread.start();
        t2.thread.start();
        t3.thread.start();
    }


}
