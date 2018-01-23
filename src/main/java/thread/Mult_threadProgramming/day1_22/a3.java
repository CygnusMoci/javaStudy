package thread.Mult_threadProgramming.day1_22;

/**
 * interrupt方法的使用
 * @author moci
 * @create 2018-01-22 3:28 PM
 **/
public class a3 extends Thread{

    @Override
    public void run() {
        super.run();
        for (int i = 0; true; i++) {
            if (this.isInterrupted()){
                System.out.println("退出！");
                break;
            }
            System.out.println("i =  "+(i+1));
        }
    }
}
