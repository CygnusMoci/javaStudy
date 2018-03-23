package TestForJob.JianZhiOffer_;

/**
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * @author moci
 * @create 2018-03-19 15:12
 **/
public class a23_StrToInt {
    public static void main(String[] args) {
        String a = "123123123";
        System.out.println(StrToInt(a));
    }

    public static int StrToInt(String str){
        //判断为空
        if (str.equals("") || str.length() == 0)
            return 0;
        char[] a = str.toCharArray();

        //判断正负号
        int fuhao = 0;
        if (a[0] == '-')
            fuhao = 1;
        int sum = 0;
        //计算
        for (int i = fuhao; i < a.length; i++)
        {
            if (a[i] == '+')
                continue;
            if (a[i] < 48 || a[i] > 57)
                return 0;
            sum = sum * 10 + a[i] - 48;
        }
        return fuhao == 0 ? sum : sum * -1;
    }
}
