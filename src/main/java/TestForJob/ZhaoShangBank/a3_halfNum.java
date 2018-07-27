package TestForJob.ZhaoShangBank;

import java.util.ArrayList;

/**
 * 超过半数问题
 * @author moci
 * @create 2018-03-26 14:46
 **/
public class a3_halfNum {
    public static void main(String[] args) {
        int [] a = {1,2,3,2,2,2,5,4,2};
        int k = getNum(a);
        System.out.println(k);

    }


    public static int getNum(int [] arr){
        int temp = arr[0];
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if(j == 0){
                temp = arr[i];
            }
            if(arr[i] == temp){
                j++;
            }else {
                j--;
            }
        }
        if (j>=1) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == temp) count++;
            }
            if (count > (arr.length / 2)) {
                return temp;
            } else {
                return -1;
            }
        } else{
            return 0;
        }
    }
}
