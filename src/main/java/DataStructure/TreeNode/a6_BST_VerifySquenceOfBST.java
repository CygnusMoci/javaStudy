package DataStructure.TreeNode;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * BST合法后序序列：最后一个值为根节点，并且可以分为两段子树，其中左子树全都小于root，右子树全都大于root。
 * @author moci
 * @create 2018-06-14 14:22
 **/
public class a6_BST_VerifySquenceOfBST {
    public static void main(String[] args) {
    }
    static boolean isPosOrderBST(int[] arr){
        int len = arr.length;
        if(len == 0 ) return false;
        if(len == 1 ) return true;

        return isPosOrderBST(arr,0,len-1);
    }

    /**
     *
     * @param arr
     * @param start 起点
     * @param root 终点（根节点坐标）
     * @return
     */
    static boolean isPosOrderBST(int[] arr,int start,int root){
        if(start > root) return true; // 开始序列到结束

        int i = root;

        while (i>start && arr[i-1]>arr[root]){
            i--; // 从右向左，找到左右子树的分段点；
        }
        for (int j = start; j < i-1 ; j++) { // 因为是从右往左找，所以不用判断右子树是否大于root的值
            if(arr[j] > arr[root])
                return false; // 如果左子树有大于root值的，则返回false
        }
        // 左右子树同时判断
        return isPosOrderBST(arr,start,i-1)&&isPosOrderBST(arr,i,root-1);
    }
}
