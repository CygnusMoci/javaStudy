package test;


/**
 * @author moci
 * @create 2018-01-18 9:29 AM
 **/
public class MainTest {

    public static void main(String arg[])
    {
        String a = "2";
        a = 1+a+1;
        System.out.println(a);
    }
    public static String unstring(String str){
        String result = "";
        for (int i = str.length()-1; i>=0; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
}


