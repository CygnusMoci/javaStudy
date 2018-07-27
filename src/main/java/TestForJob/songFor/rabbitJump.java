package TestForJob.songFor;

/**
 * @author moci
 * @create 2018-06-21 20:38
 **/
public class rabbitJump {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,6,5,4,3,2};
        int n = 7;
        System.out.println(run(arr,n));
    }

    /**
     * 没考虑冗余天数
     * @param arr 挖洞位置的数组
     * @param n 兔子洞数
     * @return
     */
    static boolean run(int [] arr,int n){
        if(arr == null || arr.length == 0) return true;

        int len = arr.length;
        int i = 0;
        for (; i < n - 2; i++) { //  123456 则从2找到5
            if(arr[i]!= i+2) return false;
            System.out.println(arr[i] + " * ");
        }

        for (; i<len; i++) { // 再从5找到2 顺序不对就退出
            if(arr[i]!= n-i+3) return false;
            System.out.println(arr[i]+" @ ");
        }
        return true;
    }

}
