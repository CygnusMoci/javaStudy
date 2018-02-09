package TestForJob.JianZhiOffer_;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author moci
 * @create 2018-01-30 1:52 PM
 **/
public class a12_findShunZi {
    public static void main(String[] args) {

    }

    public class Solution
    {
        public ArrayList<String> Permutation(String str)
        {
            ArrayList<String> res=new ArrayList<String>();
            if(str.length()==0||str==null)return res;
            int n= str.length();
            helper(res,0,str.toCharArray());
            Collections.sort(res);
            return res;

        }
        public void helper(ArrayList<String> res, int index, char []s)
        {
            if(index==s.length-1)res.add(new String(s));
            for(int i=index;i<s.length;i++)
            {
                if(i==index||s[index]!=s[i])
                {
                    swap(s,index,i);
                    helper(res,index+1,s);
                    swap(s,index,i);
                }
            }

        }

        public void swap(char[]t,int i,int j)
        {
            char c=t[i];
            t[i]=t[j];
            t[j]=c;
        }
    }
}
