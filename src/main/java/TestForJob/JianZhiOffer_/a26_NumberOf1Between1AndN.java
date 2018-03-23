package TestForJob.JianZhiOffer_;

/**
 * 求出整数1-N中1出现的次数
 * @author moci
 * @create 2018-03-19 19:01
 **/
public class a26_NumberOf1Between1AndN {
    public static void main(String[] args) {
        System.out.println(NumberOf1Between1AndN(6553556));

    }
    public static int NumberOf1Between1AndN(int n) {
        if (n <= 0) return 0;
        int count=0;
        int i=1;
        for(i=1;i<=n;i*=10){
            //i表示当前分析的是哪一个数位
            int a = n/i;
            int b = n%i;
            int temp =0;
            if(a%10==1) temp = 1;
            count= count +(a+8)/10*i+temp*(b+1);
        }
        return count;
    }
}
