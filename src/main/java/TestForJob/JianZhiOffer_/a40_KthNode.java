package TestForJob.JianZhiOffer_;

/**
 * 搜索二叉树第K个节点，利用中序遍历。
 * @author moci
 * @create 2018-03-23 14:54
 **/
public class a40_KthNode {
    public  static  int num = 0;
    public static void main(String[] args) {

    }

    public static TreeNode KthNode(TreeNode pRoot,int k){
        if(pRoot!=null){
            TreeNode temp = KthNode(pRoot.left,k);
            if(temp!=null) return temp;
            if(num++ == k) return pRoot;
            temp = KthNode(pRoot.right,k);
            if(temp!=null) return temp;
        }
        return null;
    }

}
