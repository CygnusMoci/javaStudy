package TestForJob.W163;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 小Q正在给一条长度为n的道路设计路灯安置方案。

 为了让问题更简单,小Q把道路视为n个方格,需要照亮的地方用'.'表示, 不需要照亮的障碍物格子用'X'表示。

 小Q现在要在道路上设置一些路灯, 对于安置在pos位置的路灯, 这盏路灯可以照亮pos - 1, pos, pos + 1这三个位置。

 小Q希望能安置尽量少的路灯照亮所有'.'区域, 希望你能帮他计算一下最少需要多少盏路灯。
 * @author moci
 * @create 2018-04-09 21:06
 **/
public class a8_installStreeLight {
    private static int testNum;
    private static HashMap<Integer,String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (sc.hasNext()){
            int testNum = sc.nextInt();
            if(testNum<=0) return;
            else {
                for (int i = 0; i <testNum; i++) {
                    int temp1 = sc.nextInt();
                    String temp2 = sc.next();
                    map.put(temp1,temp2);
                    int tempNum =0 ;
                    char[] chars = temp2.toCharArray();
                    int j =0;
                    while (j<chars.length){
                        if(chars[j] == '.'){
                            tempNum++;
                            j+=3;
                        }else {
                            j++;
                        }
                    }
                    arrayList.add(tempNum);
                }
            }
            System.out.println(arrayList);
        }
    }

}
