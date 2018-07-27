package TestForJob.W163;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author moci
 * @create 2018-05-28 16:12
 **/
public class a14_chuyi4 {
    static int length;
    static ArrayList<ArrayList<Integer>> list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        list = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            int key = sc.nextInt();
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int j = 0; j < key; j++) {
                tempList.add(sc.nextInt());
            }
            list.add(tempList);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(run(list.get(i)));
        }
    }

    static String run (ArrayList<Integer> list){
        int c4 = 0, c2 = 0, c1 = 0;
        int len = list.size();
        for (int i = 0; i < len; i++) {
            if(list.get(i)%4==0) c4++;
            else if(list.get(i)%2==0) c2++;
            else c1++;
        }
        //要么4的倍数的元素个数大于等于数组长度的一半（下取整）
        //要么4的倍数的元素个数大于等于奇数元素的个数
        if(c4 >= len / 2 || c4 >= c1) return "Yes";
        else return "No";
    }
}
