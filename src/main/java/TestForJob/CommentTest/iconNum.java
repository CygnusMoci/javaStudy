package TestForJob.CommentTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 未完成
 * @author moci
 * @create 2018-04-11 15:22
 **/
public class iconNum {
    static int iconNum;
    static int money;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        iconNum = sc.nextInt();
        money = sc.nextInt();
        int[] arr = new int[iconNum];
        for (int i = 0; i < iconNum; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);


        int sum = 0;
        int count = 0;
        for (int i = 0; sum<money; i++) {
            sum+=arr[i];
            count++;
        }
        for (int i = 0; sum>=money; i++) {
            sum-=arr[i];
            count--;
        }
        System.out.println(count+1);
    }


}
