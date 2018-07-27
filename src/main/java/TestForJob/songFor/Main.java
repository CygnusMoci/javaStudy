package TestForJob.songFor;

import java.util.Scanner;

/**
 * 反转子数组次数
 * [3,1,2] 到 [1,2,3] 要2次
 * @author moci
 * @create 2018-06-21 20:08
 *
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(run(arr));

    }

    static int run(int [] arr){
        int count = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) { // 从前往后判断
            if(arr[i]  != i+1) { // 如果当前数字跟位数不同
                int j = len-1;
                while (arr[j] != i+1) j--; // 从后向前找到标记数字
                for (int k = j; k >i; k--) { //　循环反转　记录次数
                    sawp(arr,k,k-1);
                    count++;
                }
            }
        }
        return count;
    }

    // 交换位置
    static void sawp(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
