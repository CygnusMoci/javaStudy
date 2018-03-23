package TestForJob.JianZhiOffer_;

/**
 * 数组中只出现一次的数字
 *从头到尾依次异或数组中的每一个数字，那么最终得到的结果就是两个只出现一次的数字的异或结果。因为其它数字都出现了两次，在异或中全部抵消掉了。由于这两个数字肯定不一样，那么这个异或结果肯定不为0 ，也就是说在这个结果数字的二进制表示中至少就有一位为1 。我们在结果数字中找到第一个为1 的位的位置，记为第N 位。现在我们以第N 位是不是1 为标准把原数组中的数字分成两个子数组，第一个子数组中每个数字的第N 位都为1 ，而第二个子数组的每个数字的第N 位都为0 。
  现在我们已经把原数组分成了两个子数组，每个子数组都包含一个只出现一次的数字，而其它数字都出现了两次。
 * @author moci
 * @create 2018-03-20 16:54
 **/
public class a31_FindNumsAppearOnce {
    public static void main(String[] args) {

    }
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]){
        if(array==null||array.length<2) return;
        int temp =0;

        for (int i = 0; i < array.length; i++) {
            temp^=array[i];
        }

        int indexOf1 = findFirstBitIs(temp);
        for (int i = 0; i < array.length; i++) {
            if(isBit(array[i], indexOf1)){
                num1[0]^=array[i];
            }else {
                num2[0]^=array[i];
            }
        }
    }

    public static int findFirstBitIs(int num){
        int indexBit = 0;
        while(((num&1)==0)&&(indexBit<8*4)){
            num=num>>1;
            indexBit++;
        }
        return indexBit;
    }

    public static boolean isBit(int num,int indexBit){
        num = num >> indexBit;
        return (num & 1) == 1;
    }
}
