package TestForJob.JianZhiOffer_;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author moci
 * @create 2018-01-12 11:42 AM
 **/


public class a1_ErWeiShuZuChaZhao {

    /**
     * 暴力遍历 效率很低  200ms
     */
    public boolean Find(int target, int [][] array) {
        int [][] a = array;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length; j++) {
                if (a[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 最佳答案 159ms 从左下角开始找
     * @param target
     * @param array
     * @return
     */
    public boolean Find2(int target,int [][] array){
        int len = array.length-1;
        int i = 0;
        while((len >= 0)&& (i < array[0].length)){
            if(array[len][i] > target){
                len--;
            }else if(array[len][i] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}
