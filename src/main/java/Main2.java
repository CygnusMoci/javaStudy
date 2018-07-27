import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 输出二叉树左视角
 * @author moci
 * @create 2018-06-14 17:06
 **/
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int len = temp.length();
        int arrLen = len/2;
        char[] arr = new char[arrLen];
        int j = 0;
        for (int i = 0; i < arrLen; i++) {
            arr[i] = temp.charAt(j);
            j+=2;
        }

        System.out.println(foo(arr));
    }

    static ArrayList<Integer> foo(char[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        int len = arr.length;
        res.add(new Integer(arr[0])-48);
        for (int i = 1; i < len;i = i*2+1) {
            int temp = i;
            while(arr[temp] == '#'){
                temp++;
                if(temp == i*2+1) break;
            }
            res.add(new Integer(arr[temp])-48);
        }
        return res;
    }

}
