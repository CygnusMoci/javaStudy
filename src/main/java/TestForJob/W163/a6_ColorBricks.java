package TestForJob.W163;

import java.util.Scanner;

/**
 * @author moci
 * @create 2018-03-25 16:11
 **/
public class a6_ColorBricks {
    static int hashtable[] = new int[256];
    public static void main(String[] args) {
       String str = "AABBCC";
       System.out.println(ColorBricks(str));

    }
    public static int ColorBricks(String str){
        char[] chars = str.toCharArray();
        if(str==null||str.length()<=1) return 0;
        int n =0;
        for (char c:chars){
            hashtable[c]++;
        }
        int count =0;
        for (int i = 0; i < hashtable.length; i++) {
            if(hashtable[i] == 1) return 0;
            if(hashtable[i] >= 2 ) n++;
        }

        return Ann(n);
    }

    public static int Ann(int n){
        if(n<=0) return 1;
        int result = 1;
        for (int i = 1; i <=n ; i++) {
            result*=i;
        }
        return result;
    }
}
