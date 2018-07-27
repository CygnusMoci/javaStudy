package TestForJob.W163;

import java.util.Scanner;

/**
 * @author moci
 * @create 2018-04-12 21:15
 **/
public class a10_numCouple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long a = System.currentTimeMillis();
            System.out.println(getPointNum(n,k));
            System.out.println("耗时："+(System.currentTimeMillis()-a)+"ms");
        }
    }
    
    public static int getPointNum(int n,int k){
        int count = 0;
        for (int i = k; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i%j>=k)  count++;
            }
        }
        return count;
    }
}
