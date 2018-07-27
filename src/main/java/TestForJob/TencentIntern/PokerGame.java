package TestForJob.TencentIntern;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author moci
 * @create 2018-05-17 19:43
 **/
public class PokerGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(run(arr,n));
    }

    static int run(int[] arr,int n){
        Arrays.sort(arr);
        int sum = 0;
        int k = -1;
        for (int i = 1; i <=n; i++) {
            sum= sum + k*arr[n-i];
            k = k*(-1);
        }
        return sum;
    }
}
