package TestForJob.JianZhiOffer_;

/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * @author moci
 * @create 2018-03-20 19:07
 **/
public class a33_FirstChar {
    int[] hashtable=new int[256]; //最大不会超过256
    StringBuffer s = new StringBuffer();
    //Insert one char from stringstream

    /**
     * 插入的过程中如果ch只出现一次 那么这个数组的值就会保持1
     * @param ch
     */
    public void Insert(char ch)
    {
        s.append(ch);
        if(hashtable[ch]==0)
            hashtable[ch]=1;
        else hashtable[ch]+=1;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] str=s.toString().toCharArray(); //把string变成char数组
        for(char c:str) //遍历
        {
            if(hashtable[c]==1)
                return c;
        }
        return '#';
    }
}
