package TestForJob.JianZhiOffer_;

/**
 * @author moci
 * @create 2018-03-12 11:06
 **/
public class a19_minNumberInRotateArray {
    public static void main(String[] args) {

    }
    public static int minNumberInRotateArray(int []array){
        if(array == null) return 0;
        int start = 0;
        int end = array.length-1;
        int middle = (start+end)/2;
        if(array[start]==array[middle]&&array[middle]==array[end]){
            for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
            return array[i + 1];
           }
        }
        return 0;
    }
}
