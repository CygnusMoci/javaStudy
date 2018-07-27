package TestForJob.JianZhiOffer_book;


import TestForJob.JianZhiOffer_.TreeNode;

/**
 * 判断是否为AVL树
 * @author moci
 * @create 2018-04-18 15:16
 **/
public class a9_isAVL {
    public static void main(String[] args) {
        TreeNode[] arr = new TreeNode[10];
        for (int i = 1; i < 10; i++) {
            arr[i] = new TreeNode(i);
        }
        arr[5].left = arr[3];
        arr[5].right = arr[8];
        arr[3].left = arr[2];
        arr[3].right = arr[4];
        arr[2].left = arr[1];
        arr[8].left = arr[7];
        arr[8].right = arr[9];
        arr[7].left = arr[6];
        System.out.println(isAVL(arr[3]));
    }

    public static boolean isAVL(TreeNode root){
        boolean[] res = new boolean[1];
        res[0] = true;
        getHeight(root,1,res);
        return res[0];

    }

    public static int getHeight(TreeNode head,int level,boolean[] res){
        if(head == null) return level;
        int lH = getHeight(head.left,level+1,res);

        if(!res[0]) return level;

        int rH = getHeight(head.right,level+1,res);

        if(!res[0]) return level;

        if(Math.abs(lH-rH)>1) res[0] = false;

        return Math.max(lH,rH);
    }

}
