package TestForJob.CommentTest;

import java.util.Stack;

/**
 * @author moci
 * @create 2018-05-15 10:22
 **/
public class str2int {
    public static void main(String[] args) {
        String str = "1234567891";
        System.out.println(run(str));
        System.out.println("系统自带函数:"+Integer.parseInt(str));
    }

    static int run(String str){
        int result = 0;
        int Bit = 1;
        int len = str.length();
        char[] chars = str.toCharArray();

        for (int i = len-1; i>=0; i--) {
            result+=Bit*(chars[i]-48);
            Bit*=10;
        }
        return result;
    }
}
