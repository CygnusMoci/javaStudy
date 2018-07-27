

/**
 * @author moci
 * @create 2018-05-11 13:25
 **/
public class HelloWorld {
    static final int _1MB = 1024*1024;
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i <_1MB; i++) {
            sum+=i;
        }
        int [] k = new int[sum];
    }
}
