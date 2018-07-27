package TestForJob.W163;

import java.util.ArrayList;
import java.util.Scanner;

/**0-1背包问题
 * @author moci
 * @create 2018-04-13 14:33
 **/
public class a12_niuniuBackPack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> food = new ArrayList<>();
        while (sc.hasNext()){
            int foodNum = sc.nextInt();
            int BackPackSize = sc.nextInt();
            for (int i = 0; i < foodNum; i++) {
                food.add(sc.nextInt());
            }

        }
    }

}
