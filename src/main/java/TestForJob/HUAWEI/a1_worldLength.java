package TestForJob.HUAWEI;

import java.util.Scanner;

/**
 * @author moci
 * @create 2018-03-08 17:24
 **/
public class a1_worldLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(wordlength(str));
        }
    }
    public static int wordlength(String str){
        int num = 0;
        int len = str.length();
        while (len>0){
            len--;
            num++;
            if(str.charAt(len)==' ') return num-1;
        }
        return num;
    }
}
