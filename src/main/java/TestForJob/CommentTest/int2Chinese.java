package TestForJob.CommentTest;

/**
 * @author moci
 * @create 2018-05-16 19:16
 **/
public class int2Chinese {
    static String[] numChinese = {"零","一","二","三","四","五","六","七","八","九"};
    static String[] Bit = {"","十","百","千","万"};
    public static void main(String[] args) {
        System.out.println(run(-1050));
    }

    static String run(int num1){
        //切换正负
        StringBuilder str = new StringBuilder();
        int num = Math.abs(num1);

        String number= num+"";
        char[] cs1 = number.toCharArray();
        int[] cs = new int[cs1.length];
        for (int i = 0; i < cs1.length; i++) {
            cs[i] = cs1[i]-48;
        }

        for (int i = 0; i <cs.length; i++) {
            int temp1 = cs.length-i-1;
            int temp2 = cs[temp1]; //数字
            if(temp2 == 0){
                continue;
            }else{
                str.insert(0,Bit[i]);//位
                str.insert(0,numChinese[temp2]);//数字
            }
        }

        if(num1<0) str.insert(0,"负");
        return str.toString();
    }
}
