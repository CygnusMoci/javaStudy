package TestForJob.JianZhiOffer_;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 找出第一个只出现一次的字符的位置
 * @author moci
 * @create 2018-03-06 15:52
 **/
public class a16_OnlyOnceChat {

    public static void main(String[] args) {
        String str = "google";
        System.out.println(FirstNotRepeatingChar(str));
    }

    public static int FirstNotRepeatingChar(String str){
        HashMap<Character,Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for(char c:chars){
            if(map.containsKey(c))
                map.replace(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        for(char c:map.keySet()){
            if(map.get(c) == 1){
                for(int i=0;i<chars.length;i++)
                    if(chars[i] == c)
                        return i+1;
            }
        }
        return -1;

    }
}
