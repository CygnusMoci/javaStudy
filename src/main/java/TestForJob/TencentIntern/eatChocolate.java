package TestForJob.TencentIntern;

import java.util.Scanner;

/**
 * @author moci
 * @create 2018-05-17 19:57
 **/
public class eatChocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(run(n,m));
        }

    }
    static long run(int n,int m){
        long result =1;
        long x;
        long temp = (f(n)-1);
        x = m/temp;
        long yushu = m-x*temp;
        result = x*f(n-1)+yushu/n;
        return result;
    }

    static long f(int n){
        return 1<<n;
    }
}
