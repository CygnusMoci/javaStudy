package TestForJob.JianZhiOffer_;

/**
 * 二叉搜索树的后序遍历序列
 * 判断一个数组序列是不是某二叉搜索树的后序遍历序列
 * 要点就是 除去最后一个根，剩下的是树分为两个后序遍历序列。
 * @author moci
 * @create 2018-03-22 15:55
 **/
public class a36_VerifySquenceOfBST {
    public static void main(String[] args) {
        int[] arr = {3,12,10,17,22,20};
        System.out.println(VerifySquenceOfBST(arr));

    }
    public static boolean VerifySquenceOfBST(int[] arr){
        if(arr.length==0) {
            return false;
        }
        if(arr.length == 1){
            return true;
        }
        return ju(arr, 0, arr.length-1);

    }

    public static boolean ju(int[] arr,int start,int root){
        if(start > root) {
            return true;
        }
        int i =root;
        while(i>start&&arr[i-1]>arr[root]){
            i--;//找到比root还小的节点；
        }
        for (int j = start; j < i-1 ; j++) {
            if(arr[j]>arr[root]){
                return false;
            }
        }

        return ju(arr,start,i-1)&&ju(arr, i, root-1);
    }
}
