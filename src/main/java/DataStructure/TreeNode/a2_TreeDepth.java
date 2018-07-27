package DataStructure.TreeNode;

/**
 * 求树的深度
 * @author moci
 * @create 2018-03-23 10:08
 **/
public class a2_TreeDepth {
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNodeEntity().treeNode;

        System.out.println(TreeDepth(treeNode));
    }

    public static int TreeDepth(TreeNode pRoot) {
        if(pRoot == null) return 0;

        if(pRoot.left == null &&pRoot.right == null ) return 1;
        int left = TreeDepth((pRoot.left));
        int right = TreeDepth((pRoot.right));
        return left>right ? left+1:right+1;
    }
}
