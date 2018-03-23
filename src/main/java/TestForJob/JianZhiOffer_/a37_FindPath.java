package TestForJob.JianZhiOffer_;

import java.util.ArrayList;

/**
 * @author moci
 * @create 2018-03-22 16:34
 **/
public class a37_FindPath {
    public static void main(String[] args) {

    }
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
        if(root == null) return paths;
        find(paths,new ArrayList<Integer>(),root,target);
        return paths;

    }

    public static void find(ArrayList<ArrayList<Integer>> paths,ArrayList<Integer> path,TreeNode root,int target){
        path.add(root.val);
        if(root.left==null&&root.right==null){
            if(target==root.val){
                paths.add(path);
            }
            return;
        }
        ArrayList<Integer> path2=new ArrayList<>();
        path2.addAll(path);
        if(root.left!=null)find(paths,path,root.left,target-root.val);
        if(root.right!=null)find(paths,path2,root.right,target-root.val);

    }

}
