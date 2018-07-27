package TestForJob.TencentIntern;

import java.util.Scanner;

/**
 * @author moci
 * @create 2018-05-17 19:39
 **/
public class flipSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(m*n/2);
        }
    }

    static int run(int m, int n){
        return n*m/2;
    }
}
