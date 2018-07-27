package TestForJob.JianZhiOffer_;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 字符串的排列
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * tips：利用回溯法
 * @author moci
 * @create 2018-01-30 1:52 PM
 **/
public class a12_findShunZi {
    public static void main(String[] args) {
        String str = "aabcd";
        new Solution().Permutation(str);
    }

     static class Solution {
        public ArrayList<String> Permutation(String str) {
            ArrayList<String> res = new ArrayList<>();
            if(str.length()==0||str==null)return res;
            int n= str.length();
            helper(res,0,str.toCharArray());
            Collections.sort(res); // 不sort的话，牛客case过不了
            return res;

        }
        public void helper(ArrayList<String> res, int index, char []s) {
            //当递归到与字符串长度相符的时候，就存入res里
            if(index==s.length-1) res.add(new String(s));

            for(int i=index;i<s.length;i++) {
                if(i==index||s[index]!=s[i]) {
                    swap(s,index,i); // 在递归后，要把顺序换回来，以免影响当前字符串的判定
                    helper(res,index+1,s);
                    swap(s,index,i);
                }
            }
        }
        public void swap(char[]t,int i,int j) {
            char c=t[i];
            t[i]=t[j];
            t[j]=c;
        }
    }
}
