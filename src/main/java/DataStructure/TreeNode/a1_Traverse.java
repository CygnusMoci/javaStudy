package DataStructure.TreeNode;

/**
 * @author moci
 * @create 2018-03-21 16:24
 **/
public class a1_Traverse {
    public static void main(String[] args) {

    }
    public static void preOrderTraverse(TreeNode t){
        if(t == null) return;
        System.out.println(t.val);
        preOrderTraverse(t.left);
        preOrderTraverse(t.right);
    }
    public static void inOrderTraverse(TreeNode t){
        if(t == null) return;
        preOrderTraverse(t.left);
        System.out.println(t.val);
        preOrderTraverse(t.right);
    }
    public static void posOrderTraverse(TreeNode t){
        if(t == null) return;
        preOrderTraverse(t.left);
        preOrderTraverse(t.right);
        System.out.println(t.val);
    }
}
