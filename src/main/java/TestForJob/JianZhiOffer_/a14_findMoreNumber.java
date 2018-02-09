package TestForJob.JianZhiOffer_;

import java.util.Arrays;

/**
 *
 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * @author moci
 * @create 2018-02-06 2:21 PM
 **/
public class a14_findMoreNumber {
    public static void main(String[] args) {
        int[] array =new int[]{4,2,1,4,2,4};
        Arrays.sort(array);
        System.out.println(array.length);
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println(MoreThanHalfNum_Solution(array));
    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        int a = 0;
        Arrays.sort(array);
        int len = array.length;
        if(len==1){
            return array[0];
        }
        for (int i = 0; i <len/2; i++) {
            double temp=0;
            int num=len/2+1;
            for (int j = i; j <i+num; j++) {
                temp=array[j]+temp;
            }
            System.out.println("这是temp: "+temp);
            System.out.println("这是num: "+num);
            if(temp/num==array[i]){
                a=array[i];
                break;
            }
        }

        return a;
    }
}
