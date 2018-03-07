package TestForJob.JianZhiOffer_;

import java.util.ArrayList;

/**
 * 寻找丑数
 * @author moci
 * @create 2018-03-06 15:01
 **/
public class a15_uglyNum {
    public static void main(String[] args) {
        System.out.println(uglyNum(20));
    }

    public static int uglyNum(int n){
        if(n==0)return 0;
        ArrayList<Integer> res=new ArrayList<Integer>();
        res.add(1);
        int i2=0,i3=0,i5=0;
        while(res.size()<n)
        {
            int m2=res.get(i2)*2;
            int m3=res.get(i3)*3;
            int m5=res.get(i5)*5;
            int min=Math.min(m2,Math.min(m3,m5));
            res.add(min);
            if(min==m2)i2++;
            if(min==m3)i3++;
            if(min==m5)i5++;
        }
        return res.get(res.size()-1);
    }


    public static int min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
}
