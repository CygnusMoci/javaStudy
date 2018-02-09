package TestForJob.JianZhiOffer_;

import java.util.ArrayList;

/**
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * @author moci
 * @create 2018-01-29 4:30 PM
 **/
public class a10_findS {
    public static void main(String[] args) {
        Solution s = new Solution();
        ArrayList<ArrayList<Integer>> a = s.FindContinuousSequence(100);
        System.out.println(a);

    }
    public static class Solution {
        public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {

            ArrayList<ArrayList<Integer>>  list = new  ArrayList<ArrayList<Integer>> ();
            double a = Math.sqrt(2)*Math.sqrt(sum);
            double sum1 = (double)sum;
            for (double i = (int)a;i>1; i--) {
               double d1 = sum1/i;
               double d2 = 1.0/2.0;
               double d3 = i/2.0;
               double s1 = d1+d2-d3;
               if (s1>0&&(s1-(int)s1)<0.0000001){
                   list.add(array((int)s1,(int)i));
               }
            }
            return list;
        }
        public ArrayList<Integer> array(int s,int num){
            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int i = 0; i <num; i++) {
                array.add(s+i);
            }
            return array;
        }
    }
}
