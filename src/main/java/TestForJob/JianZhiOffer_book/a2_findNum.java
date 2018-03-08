package TestForJob.JianZhiOffer_book;

/**
 * @author moci
 * @create 2018-03-08 14:43
 **/
public class a2_findNum {
    public static void main(String[] args) {
        int[] array = {2,3,5,4,3,2,6,7};
        System.out.println(repeatNum(array));
    }

    public static int repeatNum(int array[]) {
        int start =1;
        int end = array.length-1;
        while(end>=start){
            int middle = (end+start)/2;
            int count = counRange(array,end,start);
            if(end==start){
                if(count>1) return start;
                else break;
            }
            if(count>(middle-start+1)) end=middle;
            else start = middle+1;
        }
        return -1;
    }

    public static int counRange(int array[],int end, int start){
        if (array.length==0) return 0;
        int count = 0;
        for (int i = 0; i <array.length; i++) {
            if(array[i]>=start&&array[i]<=end) count++;
        }
        return count;
    }
}
