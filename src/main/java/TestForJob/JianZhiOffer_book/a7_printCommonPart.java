package TestForJob.JianZhiOffer_book;

/**
 * 给定两个有序链表的头指针， 打印公共部分。
 * @author moci
 * @create 2018-03-14 9:28
 **/
public class a7_printCommonPart {
    public static void main(String[] args) {
        Node n1 = new Node(20);
    }
    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value = data;
        }
    }

    public static void printCommonPart(Node head1,Node head2){
        System.out.println("Common Part:");
        while (head1!=null&&head2!=null){
            if(head1.value < head2.value){
                head1 = head1.next;
            }else if (head1.value > head2.value){
                head2 = head2.next;
            }else{
                System.out.println(head1.value + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        System.out.println();
    }
}
