package DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树，按层存入ArrayList
 * @author moci
 * @create 2018-05-31 15:31
 **/
public class a4_BFS_ArrayList {
    public static void main(String[] args) {


        TreeNode treeNode = new TreeNodeEntity().treeNode;

        ArrayList<ArrayList<Integer>> result = Print(treeNode);
        System.out.println(result);

    }
    static ArrayList<ArrayList<Integer>> Print(TreeNode head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (head == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode last = head;
        TreeNode nLast = null;
        queue.offer(head);
        ArrayList<Integer> temp = new ArrayList<>();
        while (!queue.isEmpty()) {
            head = queue.poll();
            temp.add(head.val);
            if (head.left != null) {
                queue.offer(head.left);
                nLast = head.left;
            }
            if (head.right != null) {
                queue.offer(head.right);
                nLast = head.right;
            }
            if (head == last) {
                result.add(temp);
                temp = new ArrayList<>();
                last = nLast;
            }
        }
        return result;
    }
}
