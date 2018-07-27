package DataStructure.TreeNode;

import java.util.Stack;

/**
 * 二叉树的三种遍历（递归）
 * @author moci
 * @create 2018-03-21 16:24
 **/
public class a1_Traverse {
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNodeEntity().treeNode;

        System.out.println("前序遍历：");
        preOrderTraverse(treeNode);
        System.out.println();
        System.out.println("中序遍历：");
        inOrderTraverse(treeNode);
        System.out.println();
        System.out.println("后序遍历：");
        posOrderTraverse(treeNode);
        System.out.println();

        System.out.println("深度搜索：");
        DepthFirstSearch(treeNode);
        System.out.println();


    }
    public static void preOrderTraverse(TreeNode t){
        if(t == null) return;
        System.out.print(t.val+" ");
        preOrderTraverse(t.left);
        preOrderTraverse(t.right);
    }
    public static void inOrderTraverse(TreeNode t){
        if(t == null) return;
        inOrderTraverse(t.left);
        System.out.print(t.val+" ");
        inOrderTraverse(t.right);
    }
    public static void posOrderTraverse(TreeNode t){
        if(t == null) return;
        posOrderTraverse(t.left);
        posOrderTraverse(t.right);
        System.out.print(t.val+" ");
    }

    public static void DepthFirstSearch(TreeNode t){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(t);
        while (!stack.isEmpty()){
            TreeNode tree = stack.peek();
            System.out.print(tree.val+" ");
            stack.pop();
            if(tree.right!=null){
                stack.push( tree.right);
            }
            if(tree.left!=null){
                stack.push( tree.left);
            }
        }
    }


}
