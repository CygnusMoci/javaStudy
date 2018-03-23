package TestForJob.JianZhiOffer_;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author moci
 * @create 2018-03-19 15:39
 **/
public class a24_GetLeastNumbers {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> GetLeastNumbers(int [] input, int k) {
        ArrayList<Integer> list = new  ArrayList<>();
        if(input.length < k || k == 0)
            return list;
        for (int i = 0; i < k; i++)
            list.add(input[i]);
        for (int i = k; i <input.length ; i++) {
            int j = getMax(list);
            int temp = (Integer) list.get(j);
            if (input[i] < temp)
                list.set(j, input[i]);
        }
        return list;
    }
    public static int getMax(ArrayList<Integer> list){
        int max = list.get(0);
        int j =0;
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                j = i;
            }
        }
        return j;
    }
}
