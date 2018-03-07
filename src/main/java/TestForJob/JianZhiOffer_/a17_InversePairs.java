package TestForJob.JianZhiOffer_;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * @author moci
 * @create 2018-03-06 16:32
 **/
public class a17_InversePairs {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,0};
        System.out.println(InversePairs(a));
    }
    public static int InversePairs(int [] array) {
        int len = array.length-1;
        int num =0;
        for(;len>0;len--){
            for(int i=1;i<=len;i++){
                if(array[len]<array[len-i]) num++;
            }
        }
        return num;
    }
}
