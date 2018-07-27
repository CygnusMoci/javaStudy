package TestForJob.ZhaoShangBank;

import java.util.Scanner;

/**
 * @author moci
 * @create 2018-03-26 10:51
 **/
public class a2_catchGifts {
    static int count = 0;
    public static void main(String[] args) {
        int n = 11;
        int m =110;
        int k = 6;

        if(m>n){
            System.out.println((m/n)+GiftsNum(n,m,k));
        }else {
            System.out.println(GiftsNum(n,m,k));
        }

    }
    public static int GiftsNum(int n,int m, int k){
        int left = k;
        int right = n - k;

        while (left>1||right>1){
            left /=2;
            right/=2;
            count++;
        }
        return count;
    }
}
