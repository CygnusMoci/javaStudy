package TestForJob.CommentTest;

/**
 * 一维数组解决0-1背包
 * @author moci
 * @create 2018-05-31 13:27
 **/
public class BP_1D {
    public static void main(String[] args) {
        int[] weight = {3,5,2,6,4}; //物品重量
        int[] val = {4,4,3,5,3}; //物品价值
        int m = 12; //背包容量
        int n = val.length; //物品个数

        int[] f = new int[m+1];
        int len = f.length; //f的长度
        for(int i=0;i<len;i++){ 	//不必装满则初始化为0
            f[i] = 0;
        }
        for(int i=0;i<n;i++){ // weight[i]~val[i] 物品重量对应价值
            for(int j=len-1;j>=weight[i];j--){ //这里的j就是背包的总重量
                f[j] = Math.max(f[j], f[j-weight[i]]+val[i]);
            }
        }
        for(int i=0;i<len;i++){
            System.out.print(f[i]+" ");
        }
        System.out.println();
        System.out.println("最大价值为"+f[len-1]);
    }
}
