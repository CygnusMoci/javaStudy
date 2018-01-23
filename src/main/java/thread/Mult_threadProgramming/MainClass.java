package thread.Mult_threadProgramming;

import thread.Mult_threadProgramming.day1_22.a3;

/**
 * @author moci
 * @create 2018-01-22 2:19 PM
 **/
public class MainClass {
    public static void main(String[] args) {
        try{
            a3 a3 = new a3();
            a3.start();
            a3.sleep(2000);
            a3.interrupt();
        }catch (Exception e){
            System.out.println("出错了");
        }
        System.out.println("运行结束!");
    }
}
