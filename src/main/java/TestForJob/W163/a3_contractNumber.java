package TestForJob.W163;

import java.util.Scanner;

/**
 * @author moci
 * @create 2018-02-07 2:11 PM
 **/
public class a3_contractNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.nextLine();
            String b = unstring(a);
            int a1= Integer.parseInt(a);
            int b1= Integer.parseInt(b);
            System.out.println(a1+b1);
        }

    }
    public static String unstring(String str){
        String result = "";
        for (int i = str.length()-1; i>=0; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}
