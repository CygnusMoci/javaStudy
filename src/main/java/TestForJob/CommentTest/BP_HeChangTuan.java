package TestForJob.CommentTest;

import java.util.Scanner;

/**
 * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，
 * 要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 * 每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，
 * 表示学生的个数，接下来的一行，包含 n 个整数，按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。
 * 接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。
 * @author moci
 * @create 2018-06-12 15:51
 **/
public class BP_HeChangTuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 学生人数
        int[] arr = new int[n+1];// 学生能力数组,第i个人直接对应arr[i]
        for (int i = 1; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        int kk = sc.nextInt(); // 选取k名学生;
        int dd = sc.nextInt(); // 学生之间的间距;

        long[][] bpMax = new long[n+1][kk+1]; // 最大正数组
        long[][] bpMin = new long[n+1][kk+1]; // 最大负数组

        // 初始化k=1的情况
        for (int one = 1; one < n ; one++) {
            bpMax[one][1] = arr[one];
            bpMin[one][1] = arr[one];
        }

        // 自底向上递推
        for (int k = 2; k <=kk ; k++) {
            for (int one = k; one <= n; one++) {
                //求解当one和k定的时候，最大的分割点
                long tempMin = Long.MAX_VALUE;
                long tempMax = Long.MIN_VALUE;

                for (int left = Math.max(k-1,one-dd); left <= one-1; left++) {
                    if(tempMax<Math.max(bpMax[left][k-1]*arr[one],bpMin[left][k-1]*arr[one])){
                        tempMax = Math.max(bpMax[left][k-1]*arr[one],bpMin[left][k-1]*arr[one]);
                    }
                    if(tempMin>Math.min(bpMax[left][k-1]*arr[one],bpMin[left][k-1]*arr[one])){
                        tempMin = Math.min(bpMax[left][k-1]*arr[one],bpMin[left][k-1]*arr[one]);
                    }
                }
                bpMax[one][k] = tempMax;
                bpMin[one][k] = tempMin;
            }
        }
        long result = Long.MIN_VALUE;
        for(int one = kk;one<=n;one++){
            if(result<bpMax[one][kk]){
                result = bpMax[one][kk];
            }
        }
        System.out.println(result);
    }
}
