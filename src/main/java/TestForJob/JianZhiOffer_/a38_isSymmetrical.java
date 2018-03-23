package TestForJob.JianZhiOffer_;

/**
 * 首先根节点以及其左右子树，左子树的左子树和右子树的右子树相同
 * 左子树的右子树和右子树的左子树相同即可，采用递归
 * 非递归也可，采用栈或队列存取各级子树根节点
 * @author moci
 * @create 2018-03-22 20:20
 **/
public class a38_isSymmetrical {
    public static void main(String[] args) {

    }

    public static boolean isSymmetrical(TreeNode treeNode){
        if(treeNode == null) return false;

        return fuction(treeNode.left,treeNode.right);
    }
    public static boolean fuction(TreeNode t1,TreeNode t2){
        if(t1 == null && t2 == null) return true;
        if(t1 != null && t2 != null) return t1.val == t2.val && fuction(t1.left,t2.right) && fuction(t1.right, t2.left);

        return false;
    }
}
