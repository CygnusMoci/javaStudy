package DataStructure.TreeNode;

/**
 * @author moci
 * @create 2018-06-13 15:42
 **/
public class TreeNodeEntity {
    public TreeNode treeNode;
    TreeNodeEntity(){
        treeNode = init();
    }
    public TreeNode init(){
        TreeNode[] arr = new TreeNode[10];
        for (int i = 1; i < 10; i++) {
            arr[i] = new TreeNode(i);
        }
        arr[5].left = arr[3]; //头节点
        arr[5].right = arr[8];
        arr[3].left = arr[2];
        arr[3].right = arr[4];
        arr[2].left = arr[1];
        arr[8].left = arr[7];
        arr[8].right = arr[9];
        arr[7].left = arr[6];
        return arr[5];
    }
}
