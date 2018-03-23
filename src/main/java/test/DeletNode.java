package test;

/**
 * @author moci
 * @create 2018-03-15 9:45
 **/
public class DeletNode{

    public static void main(String[] args) {
        int sum = 0;
        Node n1 = new Node(sum);
        for (int i = 0; i <10; i++) {
            add(n1,sum+=i);
            n1 = n1.next;
        }
        Node temp = n1;
        for (int i = 0; i <10; i++) {
            System.out.println(temp.value);
            temp =temp.next;
        }

    }



    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value = data;
        }
    }

    public static void add(Node fatherNode,int value){
        Node node = new Node(value);
        fatherNode.next = node;
    }



}
