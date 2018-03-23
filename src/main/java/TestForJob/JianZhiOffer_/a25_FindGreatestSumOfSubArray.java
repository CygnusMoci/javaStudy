package TestForJob.JianZhiOffer_;

/**
 * @author moci
 * @create 2018-03-19 16:06
 **/
public class a25_FindGreatestSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,10,-4,7,2,-5};
        System.out.println(FindGreatestSumOfSubArray(arr));
    }
    public static int FindGreatestSumOfSubArray(int[] array) {
        if(array == null||array.length<=0){
            return 0;
        }
        int nCurSum = 0;
        int nCurMaxSum = 0x80000000;
        for (int i = 0; i < array.length; i++) {
            if(nCurSum<=0){
                nCurSum = array[i];
            }else{
                nCurSum +=array[i];
            }
            if(nCurSum>nCurMaxSum){
                nCurMaxSum = nCurSum;
            }
        }
        return nCurMaxSum;
    }
}
