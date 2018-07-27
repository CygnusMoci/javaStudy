package TestForJob.W163;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author moci
 * @create 2018-04-13 13:43
 **/
public class a11_niuniuGetUp {
    public static void main(String[] args) {
        ArrayList<Integer> Time = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();//闹钟数量

            for (int i = 0; i < num; i++) { //闹钟时间
                Time.add(Integer.parseInt(sc.next())*60+Integer.parseInt(sc.next()));//每个闹钟的时间
            }

            int time = sc.nextInt();//到学校需要时间
            int finalTime =Integer.parseInt(sc.next())*60+Integer.parseInt(sc.next());//时间上限

            int edgeTime = finalTime-time; //边缘时间，在此时间之前都可以
            boolean flag = true;
            Collections.sort(Time); //排序
            int j=num-1;
            for (int i = num-1; flag; i--) {
                if(Time.get(i)<=edgeTime){
                    flag = false;
                    j =i;
                };
            }
            int hour = Time.get(j)/60;
            int min  = Time.get(j)%60;
            System.out.println(hour+" "+min);

        }
    }


}
