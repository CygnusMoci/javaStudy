package TestForJob.JianZhiOffer_;

import java.util.ArrayList;
import java.util.Stack;

/**输入一个链表，反转链表后，输出链表的所有元素。
 * 因为是无头链表 所以26行的位置靠前 本应该是28行之后
 * @author moci
 * @create 2018-03-15 10:28
 **/
public class a21_ReverseList {
    public static void main(String[] args) {

    }
    public ListNode ReverseList(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<ListNode> stackNode = new Stack<>();
        ListNode current = head;
        while (current!=null){
            arrayList.add(current.val);
            stackNode.push(current);
            current = current.next;
        }
        int i =0;
        while (!stackNode.isEmpty()){
            head = head.next;
            head = stackNode.pop();
            head.val = arrayList.get(i);
            i++;
        }
        return head;
    }


}
