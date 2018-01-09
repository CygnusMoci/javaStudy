package TestForJob.TencentIntern;

import java.util.Scanner;

/**
 * 小Q最近遇到了一个难题：把一个字符串的大写字母放到字符串的后面，各个字符的相对位置不变，且不能申请额外的空间。你能帮帮小Q吗？
 * @author moci
 * @create 2018-01-09 1:50 PM
 **/
public class partAa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            for (int i = 0; i <s.length() ; i++) {
                if (s.charAt(i)>='a'&&s.charAt(i)<='z'){
                    System.out.print(s.charAt(i));
                }
            }
            for (int i = 0; i <s.length() ; i++) {
                if (s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                    System.out.print(s.charAt(i));
                }
            }
        }
    }
}
