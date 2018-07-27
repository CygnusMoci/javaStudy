package DataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的按层打印
 * @author moci
 * @create 2018-05-17 16:18
 **/
public class a3_BFS {

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNodeEntity().treeNode;
        BFS(treeNode);
    }

    static void BFS(TreeNode head){
        if(head == null) return;
        //BFS一般使用队列来辅助
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 1; //初始层数
        TreeNode last = head;
        TreeNode nLast = null;
        queue.offer(head);
        System.out.print("层数" + (level++)+" : ");
        while (!queue.isEmpty()){//循环到叶末
            head = queue.poll(); //出队
            System.out.print(head.val + " ");
            if(head.left != null){
                queue.offer(head.left); //左节点入队
                nLast = head.left;
            }
            if(head.right != null){
                queue.offer(head.right); //右节点入队
                nLast = head.right;
            }

            if(head  == last && !queue.isEmpty()){
                System.out.print("\n层数" + (level++)+" : ");
                last = nLast;
            }
        }
    }
}
