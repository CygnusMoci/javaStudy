package TestForJob.JianZhiOffer_book;

import java.util.LinkedList;

/**
 * @author moci
 * @create 2018-03-09 20:26
 **/
public class a4_windowMaxNum {
    public static void main(String[] args) {

        int[] arr = new int[]{2,3,4,5,6,7,8,2,1,3,4,5,6};
        int [] reslut = windowMaxNum(arr,3);
        for (int i = 0; i <reslut.length; i++) {
            System.out.print(reslut[i]+" ");
        }

    }
     public static int[] windowMaxNum(int[] array,int w){
        if (array==null||w<1||array.length<w) return null;

        LinkedList<Integer> qmax = new LinkedList<>();
        int[] res = new int[array.length-w+1];
        int index = 0;
        for (int i = 0; i <array.length ; i++) {
            while (!qmax.isEmpty()&&array[qmax.peekLast()]<=array[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if(qmax.peekFirst()==i-w){
                qmax.pollFirst();
            }
            if(i>=w-1){
                res[index++] = array[qmax.peekFirst()];
            }
        }
        return  res;
    }
}
