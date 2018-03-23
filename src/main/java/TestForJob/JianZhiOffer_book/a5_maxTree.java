package TestForJob.JianZhiOffer_book;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author moci
 * @create 2018-03-11 18:51
 **/
public class a5_maxTree {
    public static void main(String[] args) {

    }
    public static class Node{
        private int value;
        public Node left;
        public Node right;

        public Node(int data){
            this.value =data;
        }
    }

    public static Node getMaxTree(int[] arr){
        Node[] nArr = new Node[arr.length];
        for (int i = 0; i != nArr.length ; i++) {
                nArr[i] = new Node(arr[i]);
        }
        Stack<Node> stack  = new Stack<>();
        HashMap<Node,Node> lBigMap = new HashMap<>();
        HashMap<Node,Node> rBigMap = new HashMap<>();
        /**
         * 利用stack来实现
         */
        for (int i = 0; i != nArr.length; i++) {
            Node curNode = nArr[i];
            while((!stack.isEmpty())&&stack.peek().value<curNode.value){
                popStackSetMap(stack,lBigMap);
            }
        }
        for (int i = nArr.length-1; i != -1 ; i--) {
            Node curNode = nArr[i];
            while ((!stack.isEmpty())&&stack.peek().value<curNode.value){
                popStackSetMap(stack,rBigMap);
            }
            stack.push(curNode);
        }

        while(!stack.isEmpty()){
            popStackSetMap(stack,rBigMap);
        }
        Node head = null;
        for (int i = 0; i != nArr.length ; i++) {
            Node curNode = nArr[i];
            Node left = lBigMap.get(curNode);
            Node right = rBigMap.get(curNode);
            if(left == null&&right==null){
                head = curNode;
            }else if (left == right){
                if(right.left == null){
                    right.left= curNode;
                }else {
                    right.right = curNode;
                }
            }else if (right == null){
                if(left.left == null){
                    left.left= curNode;
                }else {
                    left.right = curNode;
                }
            }else{
                Node parent = left.value<right.value? left:right;
                if(parent.left == null){
                    parent.left = curNode;
                }else{
                    parent.right = curNode;
                }
            }
        }
        return  head;
    }

    public static void popStackSetMap(Stack<Node> stack,HashMap<Node,Node>map){
        Node popNode = stack.pop();
        if(stack.isEmpty()){
            map.put(popNode,null);
        }else{
            map.put(popNode,stack.peek());
        }
    }
}
