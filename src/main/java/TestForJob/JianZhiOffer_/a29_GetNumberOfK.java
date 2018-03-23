package TestForJob.JianZhiOffer_;


/**
 * 统计一个数字在排序数组中出现的次数。
 * 二分查找法解决
 * @author moci
 * @create 2018-03-20 10:22
 **/
public class a29_GetNumberOfK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,5,6,7};
        int k = 4;
        int p =GetNumberOfK(arr,k);
        System.out.println(p);

    }
    public static int GetNumberOfK(int[] array,int k){
        int firstPlace = getFirst(array, k);
        int lastPlace = getLast(array, k);
        return lastPlace-firstPlace+1;

    }
    public static int getFirst(int[] array,int k){
        int firstPlace = 0;
        int lastPlace = array.length-1;
        int mid =firstPlace + (lastPlace - firstPlace)/2;
        while(firstPlace<=lastPlace){
            if(array[mid]<k){
                firstPlace = mid+1;
            }else{
                lastPlace = mid -1;
            }
            mid =firstPlace + (lastPlace - firstPlace)/2;
        }
        return firstPlace;
    }

    public static int getLast(int[] array,int k){
        int firstPlace = 0;
        int lastPlace = array.length-1;
        int mid =firstPlace + (lastPlace - firstPlace)/2;
        while(firstPlace<=lastPlace){
            if(array[mid]<=k){
                firstPlace = mid+1;
            }else{
                lastPlace = mid -1;
            }
            mid =firstPlace + (lastPlace - firstPlace)/2;
        }
        return lastPlace;
    }

}
