package TestForJob.JianZhiOffer_book;

import java.util.ArrayList;

/**
 * @author moci
 * @create 2018-03-08 14:10
 **/
public class a1_findRepeatNum {
    public static void main(String[] args) {
        int[] array = {1,2,3,0,2,5,3};
        System.out.println(getNum(array));

    }

    public static int getNum(int[] array){
        for (int i = 0; i <array.length ; i++) {
            while(array[i]!=i) {
                if(array[array[i]]==array[i]) return array[i];
                int temp = array[array[i]];
                array[array[i]]=array[i];
                array[i] = temp;
            }
        }
        return -1;
    }
}
