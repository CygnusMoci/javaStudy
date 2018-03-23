package TestForJob.JianZhiOffer_book;

/**
 * 删除单链表第K个节点
 * @author moci
 * @create 2018-03-14 9:53
 **/
public class a8_deletKNode {
    public static void main(String[] args) {

    }

    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value = data;
        }
    }

    public static Node removeLastKthNode(Node head,int lastKth){
        if (head ==null || lastKth<1){
            return head;
        }

        Node cur = head;
        while(cur!=null){
            lastKth--;
            cur = cur.next;
        }
        if(lastKth < 0){
            head = head.next;
        }
        if(lastKth <0){
            cur = head;
            while (++lastKth != 0){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return  head;
    }

}
