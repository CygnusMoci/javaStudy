package TestForJob.JianZhiOffer_;

import java.util.ArrayList;

/**
 * @author moci
 * @create 2018-01-30 1:17 PM
 **/
public class a11_findDoubleS {
    public static void main(String[] args) {
        int[] array = new int[]{2,3,4,5,6,7,8,9,13};
        System.out.println(FindNumbersWithSum(array,12));

    }

    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int len = array.length-1;
        int i = 0;
        while(i < len){
            if(array[i]+array[len]<sum){
                i++;
            }else if(array[i]+array[len]>sum){
                len--;
            }else if(array[i]+array[len]==sum){
                a.add(array[i]);
                a.add(array[len]);
                break;
            }
        }
        return a;
    }
}
