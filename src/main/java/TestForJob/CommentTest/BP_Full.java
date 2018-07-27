package TestForJob.CommentTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 完全背包问题
 * @author moci
 * @create 2018-05-31 14:15
 **/
public class BP_Full {
    public static void main(String[] args){
        int[] weight = {3,4,6,2,5};
        int[] val = {6,8,7,5,9};
        int maxw = 10; //
        int[] f = new int[maxw+1];
        for(int i=0;i<f.length;i++){
            f[i] = 0;
        }
        for(int i=0;i<val.length;i++){
            for(int j=weight[i];j<f.length;j++){
                f[j] = Math.max(f[j], f[j-weight[i]]+val[i]);
            }
        }
        Queue<Integer> qeue = new LinkedList<>();
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println(f[maxw]);
    }
}
