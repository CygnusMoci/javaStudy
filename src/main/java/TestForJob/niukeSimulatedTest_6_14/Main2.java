package TestForJob.niukeSimulatedTest_6_14;
import java.util.Scanner;

/**
 * 一闪一闪亮晶晶，满天都是小星星，牛牛晚上闲来无聊，便躺在床上数星星。
 牛牛把星星图看成一个平面，左上角为原点(坐标为(1, 1))。
 现在有n颗星星，他给每颗星星都标上坐标(xi，yi)，表示这颗星星在第x行，第y列。
 现在，牛牛想问你m个问题，给你两个点的坐标(a1, b1)(a2，b2)，
 表示一个矩形的左上角的点坐标和右下角的点坐标，请问在这个矩形内有多少颗星星（边界上的点也算是矩形内）。
 * @author moci
 * @create 2018-06-14 14:52
 **/
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xArr = new int[n];
        int[] yArr = new int[n];
        for (int i = 0; i < n; i++) {
            xArr[i] = sc.nextInt();
            yArr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int temp = 0;
            for (int j = 0; j <n; j++) {
                if(innerNumber(xArr[j],yArr[j],x1,y1,x2,y2)) temp++;
            }
            res[i] = temp;
        }
        for (int i = 0; i < m; i++) {
            System.out.println(res[i]);
        }

    }

    static boolean innerNumber(int x,int y,int x1,int y1,int x2,int y2){
        if(y1 > y2){
            if(x>=x1&&x<=x2&&y<=y1&&y>=y2)
                return true;
            else return false;
        }else {
            if(x>=x1&&x<=x2&&y>=y1&&y<=y2)
                return true;
            else return false;
        }
    }
}
