package TestForJob.JianZhiOffer_;

/**
 * @author moci
 * @create 2018-03-15 15:28
 **/
public class a22_MergeNode {
    public static void main(String[] args) {

    }
    public static ListNode Merge(ListNode list1, ListNode list2){
        ListNode result = null;
        if(list1 == null) return list2;
        else if(list2 == null) return list1;

        if(list1.val>list2.val){
            result = list2;
            result.next = Merge(list1.next,list2);
        }else {
            result = list1;
            result.next = Merge(list1,list2.next);
        }
        return result;
    }
}
