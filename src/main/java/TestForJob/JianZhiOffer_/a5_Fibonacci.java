package TestForJob.JianZhiOffer_;

/**
 * @author moci
 * @create 2018-01-18 10:46 AM
 **/
public class a5_Fibonacci {
    public static void main(String[] args) {
        try {
            int n =44;
            long startTime=System.currentTimeMillis();
            System.out.println(Fibonacci(n));
            long endTime=System.currentTimeMillis();
            System.out.println((endTime-startTime)+"ms");

            long startTime1=System.currentTimeMillis();
            System.out.println(Fib(n));
            long endTime1=System.currentTimeMillis();
            System.out.println((endTime1-startTime1)+"ms");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public static int Fibonacci(int n){
        if(n==0){
            return 0;
        }else if (n<=2){
            return 1;
        }else {
            int[] array = new int[n + 2];
            array[0] = 1;
            array[1] = 1;
            for (int i = 2; i <= n + 1; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            return array[n-1];
        }
    }

    public static int Fib(int n){
        if(n<=1) return n;
        else return Fib(n-1)+Fib(n-2);
    }
}
