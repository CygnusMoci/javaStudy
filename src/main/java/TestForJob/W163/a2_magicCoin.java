package TestForJob.W163;

import java.util.Scanner;

/**
 * @author moci
 * @create 2018-02-07 12:05 PM
 **/
public class a2_magicCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int coinNum = sc.nextInt();
            String result = "";
            while (coinNum>0){
                if(coinNum%2==1){
                    result = 1+result;
                    coinNum = coinNum/2;
                }else if(coinNum%2==0){
                    result = 2+result;
                    coinNum = (coinNum-2)/2;
                }
            }
            System.out.println(result);
        }
    }
}


//    public static String unstring(String str){
//        String result = "";
//        for (int i = str.length()-1; i>=0; i--) {
//            result+=str.charAt(i);
//        }
//        return result;
//    }
