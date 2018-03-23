package TestForJob.JianZhiOffer_;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author moci
 * @create 2018-03-23 11:04
 **/
public class a39_PrintNodeZhi {
    public static void main(String[] args) {

    }
    public static ArrayList<ArrayList<Integer>> Print(TreeNode root){
        if(root == null) return null;
        int layer =1;
        Stack<TreeNode> s1 = new Stack<>();
        s1.push(root);
        Stack<TreeNode> s2 = new Stack<>();

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        while (!s1.isEmpty()||!s2.isEmpty()){
            if(layer%2==0){
               ArrayList<Integer> temp = new ArrayList<Integer>();
               while (!s1.isEmpty()){
                   TreeNode node = s1.pop();
                   if(node!=null){
                       temp.add(node.val);
                       s2.push(node.left);
                       s2.push(node.right);
                   }
               }
               if(!temp.isEmpty()){
                   list.add(temp);
                   layer++;
               }
            }
        }
        return list;

    }
}
