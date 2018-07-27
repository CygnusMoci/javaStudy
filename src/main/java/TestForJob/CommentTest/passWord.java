package TestForJob.CommentTest;

import java.util.Scanner;

/**
 * @author moci
 * @create 2018-04-11 14:36
 **/
public class passWord {
    public static void main(String[] args) {
        String str = gets();
        System.out.println(getPassWord(str));
    }

    public static String getPassWord(String str){
        if(str == null||str.length()<=0) return null;

        String result = "";
        for (int i = 0; i <str.length(); i++) {


            if(str.charAt(i)<='y'&&str.charAt(i)>='a'){
                result+=(char)(str.charAt(i)+1);
            }else
            if(str.charAt(i)<='Y'&&str.charAt(i)>='A'){
                result+=(char)(str.charAt(i)+1);
            }else
            if(str.charAt(i)=='z'){
                result+='a';
            }else
            if(str.charAt(i)=='z'){
                result+='a';
            }else
            if(str.charAt(i)=='Z'){
                result+='A';
            }else{
                result +=str.charAt(i);
            }
        }
        return result;
    }

    public static String gets(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
