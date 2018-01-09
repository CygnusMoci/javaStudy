package TestForJob.W163;
import java.util.Scanner;

/**
 * 优雅的点
 * 小易有一个圆心在坐标原点的圆，小易知道圆的半径的平方。小易认为在圆上的点而且横纵坐标都是整数的点是优雅的，小易现在想寻找一个算法计算出优雅的点的个数，请你来帮帮他。
 例如：半径的平方如果为25
 优雅的点就有：(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)，一共12个点。
 * @author moci
 * @create 2018-01-09 4:07 PM
 **/
public class wonderfulPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int r = sc.nextInt();
            System.out.println(result(r));
        }
    }

    public static int result(int arg){
        //判断0的情况
        if(arg < 0) return 0;
        if(arg == 0) return 1;


        int count = 0;
        double r = Math.sqrt(arg); //得到半径
        double x = Math.sqrt(2) * r / 2;// ??撒子哦

        if(x - (int)x < 0.000001)
            count += 4;
        if(r - (int)r < 0.000001)
            count += 4;
        int ix = (int)x;
        ix++;
        double y;
        for(; ix < r; ix++)
        {
            y = Math.sqrt(arg - ix * ix);
            if(y - (int)y < 0.00000001)
                count += 2 * 4;
        }
        return count;
    }
}
