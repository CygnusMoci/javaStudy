package TestForJob.JianZhiOffer_;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * @author moci
 * @create 2018-03-21 15:38
 **/
public class a34_MirrorTreeNode {
    public static void main(String[] args) {

    }
    public static void Mirror(TreeNode root) {
        if(root!= null){
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            if(root.left!= null){
                Mirror(root.left);
            }
            if(root.right!= null){
                Mirror(root.right);
            }
        }
    }
}
