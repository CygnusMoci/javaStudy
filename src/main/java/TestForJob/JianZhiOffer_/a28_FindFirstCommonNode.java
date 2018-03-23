package TestForJob.JianZhiOffer_;

/**
 * @author moci
 * @create 2018-03-20 9:46
 **/
public class a28_FindFirstCommonNode {
    public static void main(String[] args) {

    }
    public static ListNode FindFirstCommonNode(ListNode firshNode,ListNode secondNode){
        int fnlen = getListNodeLength(firshNode);
        int snlen = getListNodeLength(secondNode);
        int lenDif  = fnlen -snlen;
        ListNode a1 = firshNode;
        ListNode a2 = secondNode;
        if(lenDif<0){
             lenDif  = snlen- fnlen;
             a1 = secondNode;
             a2 = firshNode;
        }

        for (int i = 0; i < lenDif; i++) {
            a1 = a1.next;
        }
        while ((a1!=null)&&(a2!=null)&&(a1!=a2)){
            a1=a1.next;
            a2=a2.next;
        }

        ListNode commonNode = a1;
        return commonNode;
    }
    
    public static int getListNodeLength(ListNode node){
        int len = 0;
        ListNode a = node;
        while (a!=null){
            len++;
            a = a.next;
        }
        return len;
    }
}
