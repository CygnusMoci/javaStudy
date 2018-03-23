package TestForJob.JianZhiOffer_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 利用了comparator接口
 * @author moci
 * @create 2018-03-19 19:54
 **/
public class a27_PrintMinNumber {
    public static void main(String[] args) {
        int[] array = {12,23,42,12,3,42,123};
        System.out.println(PrintMinNumber(array));

    }
    public static String PrintMinNumber(int [] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = numbers.length;
        String str = "";
        for(int i=0;i<n;i++){
            list.add(numbers[i]);//将数组放入arrayList中
        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer str1, Integer str2) {
                //定义: a+b>b+a 则 a>b ……
                String s1=str1+""+str2;
                String s2=str2+""+str1;
                return s1.compareTo(s2);
            }
        });

        for(int j:list){
            str+=j;
        }
        return str;
    }
}
