package TestForJob.W163;

import java.util.Scanner;

/**
 * @author moci
 * @create 2018-02-07 2:17 PM
 **/
public class a4_stringPiece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            double sum = str.length();
            double time =1;
            if (str.length()==0){
                System.out.println(0);
            }else{
                for (int i = 0; i <str.length()-1; i++) {
                    if(str.charAt(i)!=str.charAt(i+1)){
                        time++;
                    }
                }
                double a = sum/time;
                System.out.println(String.format("%.2f", a));
            }

        }
    }
}
