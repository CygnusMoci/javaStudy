package TestForJob.JianZhiOffer_;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * 字符串替换请使用stringbuilder.append  toString
 * @author moci
 * @create 2018-01-12 3:55 PM
 **/
public class a2_ReplaceBlankspace {

    public static void main(String[] args) {
        StringBuffer str =new StringBuffer("we are happy.");
        System.out.println();
    }

    /**
     * 18ms
     占用内存：12556k
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        String replace = "";
        char a = ' ';

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==a){
                replace +="%20";
                i++;
            }else {
                replace += str.charAt(i);
            }
        }
        return replace;
    }

    /**
     * 最佳答案
     * @param str
     * @return
     */
    public String replaceSpace2(StringBuffer str) {
        if(str==null){
            return null;
        }
        StringBuilder newStr = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                newStr.append('%');
                newStr.append('2');
                newStr.append('0');
            }else{
                newStr.append(str.charAt(i));
            }
        }
        return newStr.toString();
    }

    public static String replace3(StringBuffer  str){
        int p1 = str.length();
        int p2 = blankNum(str)*2+p1;
        StringBuilder newstr = new StringBuilder(p2);
        while (p1>0){
            if(str.charAt(p1)==' '){
                newstr.append('%');
                newstr.append('2');
                newstr.append('0');
                p2=p1;
                p1-=3;

            }else{
                newstr.setCharAt(p2,str.charAt(p1));
                p1--;
                p2--;
            }
        }
        return newstr.toString();
    }

    public static int blankNum(StringBuffer str){
        int num=0;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)==' ') num++;
        }
        return num;
    }
}
