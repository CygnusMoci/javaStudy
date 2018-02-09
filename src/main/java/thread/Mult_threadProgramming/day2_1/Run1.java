package thread.Mult_threadProgramming.day2_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author moci
 * @create 2018-02-01 10:34 AM
 **/
public class Run1 {
    private static Timer timer = new Timer(true);
    public static class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("当前时间为 : "+new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2018-02-01 10:44:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间 : " +dateRef.toLocaleString());
            System.out.println("现在时间   : "+new Date().toLocaleString());
            timer.schedule(task,dateRef);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
