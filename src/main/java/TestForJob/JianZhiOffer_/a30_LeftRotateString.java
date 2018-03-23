package TestForJob.JianZhiOffer_;

/**
 * 旋转字符串
 * @author moci
 * @create 2018-03-20 15:37
 **/
public class a30_LeftRotateString {
    public static void main(String[] args) {
        String a = "abcdefg1234567";
        System.out.println(LeftRotateString(a,5));
    }
    public static String LeftRotateString(String str , int n){
        if(str.length()<n) return "";
        if(str.length()==n) return str;
        StringBuffer result = new StringBuffer("");
        for (int i = n; i <str.length(); i++) {
            result.append(str.charAt(i));
        }
        for (int i = 0; i <n; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
