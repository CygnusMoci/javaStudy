package TestForJob.W163;

import java.util.Scanner;

/**
 * @author moci
 * @create 2018-04-09 15:08
 **/
public class a7_magicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int left = sc.nextInt();
            int right = sc.nextInt();
            System.out.print(getNum(left,right));
        }
    }
    public static int getNum(int leftNum,int rightNum){
        int result = 0;
        for (int i = leftNum; i <=rightNum; i++) {
            if(i%3 == 2||i%3==0) result++;
        }
        return result;
    }
}
