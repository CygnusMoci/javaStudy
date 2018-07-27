package TestForJob.ZhaoShangBank;
import java.util.Scanner;

/**
 * 按照卡中心校园招聘的要求，
 * HR小招和小商需要从三个科室中（分别为A、B、C）抽派面试官去往不同城市。
 * 两名HR按照以下规定轮流从任一科室选择面试官：
 * 每次至少选择一位，至多选择该科室剩余面试官数。最先选不到面试官的HR需要自己出差。
 * 假设HR小招和小商都不想出差且每次选择都采取最优策略，如果是小招先选，写一个函数来判断她是否需要出差。
 * 如果不需要出差，请给出第一步的最优策略。
 * Nim游戏的改版
 * @author moci
 * @create 2018-03-26 10:24
 **/
public class a1_HrTrip {
    private static int[] a = new int[3];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int A = a[0];
        int B = a[1];
        int C = a[2];

        int result = A^B^C;
        if(result == 0){
            System.out.println(1);
        }else {
            if((A^B)<C){
                System.out.println("C,"+(C-(A^B)));
            }
            if((A^C)<B){
                System.out.println("B,"+(B-(A^C)));
            }
            if((B^C)<A){
                System.out.println("A,"+(A-(C^B)));
            }
        }
    }
}
