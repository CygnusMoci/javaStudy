package DataStructure.TreeNode;

/**
 * 平衡二叉树中的最大平衡二叉树
 * 递归要点：
 * 1：如果以Node为根节点的树，左右均为BST，且Node.left<Node<Node.right 整棵树都是就是最大平衡二叉树
 * 2：如果不满足条件1，则看left跟right的高度，选取最大平衡二叉树。
 * @author moci
 * @create 2018-06-13 15:49
 **/
public class a5_BST_biggstSubBST {
    static TreeNode treeNode = new TreeNodeEntity().treeNode;

    public static void main(String[] args) {

        a1_Traverse.preOrderTraverse(treeNode);
        TreeNode res = biggestSubBst(treeNode);
        System.out.println("最大子树为：");
        a1_Traverse.preOrderTraverse(res);

    }
    static TreeNode biggestSubBst(TreeNode head){
        int[] record = new int[3];
        return posOrder(head,record);
    }

    static TreeNode posOrder(TreeNode head,int[] record){
        if(head == null) {
            record[0] = 0;
            record[1] = Integer.MAX_VALUE;
            record[2] = Integer.MIN_VALUE;
            return null;
        }

        int value= head.val;
        TreeNode left = head.left;
        TreeNode right = head.right;
        TreeNode lBST = posOrder(left,record); // 左边的BST
        int lSize = record[0];
        int lMin = record[1];
        int lMax = record[2];
        TreeNode rBST = posOrder(right,record); // 右边的BST
        int rSize = record[0];
        int rMin = record[1];
        int rMax = record[2];

        record[1] = Math.min(lMin,value);
        record[2] = Math.max(rMax,value);

        if(left == lBST && right == rBST && lMax < value && value>rMin){
            // 返回整棵树
            record[0] = lSize + rSize + 1; // 整棵树的节点数
            return head;
        }
        record[0] = Math.max(lSize,rSize);
        return lSize>rSize? lBST:rBST; // 返回左子树或者右子树
    }
}
