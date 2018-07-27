package TestForJob.CommentTest;

import java.util.Scanner;

/**
 *一只袋鼠要从河这边跳到河对岸，河很宽，但是河中间打了很多桩子，
 * 每隔一米就有一个，每个桩子上都有一个弹簧，袋鼠跳到弹簧上就可以跳的更远。
 * 每个弹簧力量不同，用一个数字代表它的力量，如果弹簧力量为5，就代表袋鼠下一跳最多能够跳5米，
 * 如果为0，就会陷进去无法继续跳跃。河流一共N米宽，袋鼠初始位置就在第一个弹簧上面，
 * 要跳到最后一个弹簧之后就算过河了，给定每个弹簧的力量，求袋鼠最少需要多少跳能够到达对岸。
 * 如果无法到达输出-1
 * @author moci
 * @create 2018-06-12 15:08
 **/
public class BP_crossingRiver {

    public static void main(String[] args) {
        int n = 39;
        int[] arr = {3,6,6,6,3,8,9,8,5,2,9,7,3,6,5,4,2,3,6,9,9,8,6,4,1,0,4,4,8,9,3,6,0,7,8,1,1,8,4};
//        System.out.println(arr.length);
          System.out.println(foo(n,arr));
    }

    static int foo(int n ,int[] arr){

        int[] dp = new int[n];
        for(int i = 0;i < n;i++) {
            dp[i] = 10000;
        }
        dp[0] = 1;//初值，一开始袋鼠就在第一个弹簧上
        for(int i = 1; i < n; i++) {
            for(int j = i-1;j>=0;j--) {
                if(arr[j] == 0)
                    continue;
                if(j + arr[j] >= i) {
                    dp[i] =Math.min(dp[i], dp[j]+1);
                }
            }
        }
        if(dp[n-1] == 10000) return -1;
        else return dp[n-1]-1;
    }
}
