package DataStructure.TreeNode;

import javafx.scene.transform.Rotate;

import java.util.ArrayList;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * tips:所有路径 ||
 * @author moci
 * @create 2018-06-14 14:58
 **/
public class a7_findPath {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNodeEntity().treeNode;
        ArrayList<ArrayList<Integer>> list = findPath(treeNode,10);
        System.out.println(list);
    }
    static ArrayList<ArrayList<Integer>> findPath(TreeNode root,int target){

        ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();

        if(root == null) return paths;

        find(paths,new ArrayList<Integer>(),root,target);
        return paths;
    }

    /**
     *
     * @param paths 总容器
     * @param path 单个存储
     * @param root 根节点
     * @param target 目标值
     */
    static void find(ArrayList<ArrayList<Integer>> paths,ArrayList<Integer> path,TreeNode root,int target){
        path.add(root.val); // 根节点必定存在

        // 最终叶子节点的情况，
        if(root.right == null && root.left == null){
            if(root.val == target) {
                paths.add(path);
            }
            return;
        }
        ArrayList<Integer> path2=new ArrayList<>();
        path2.addAll(path);
        if(root.left!=null) find(paths,path,root.left,target-root.val);
        if(root.right!=null) find(paths,path2,root.right,target-root.val);
    }
}
