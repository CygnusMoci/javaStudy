package TestForJob.JianZhiOffer_;

import test.DeletNode;
import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 * 利用stack
 * @author moci
 * @create 2018-03-15 10:10
 **/
public class a20_printListFromTailToHead {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode head = listNode;
        while (head != null){
            stack.push(head.val);
            head = head.next;
        }
        while (!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}
