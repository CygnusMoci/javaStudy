package TestForJob.W163;

import java.util.Scanner;

/**
 * @author moci
 * @create 2018-04-12 21:02
 **/
public class a9_findWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int time = sc.nextInt();
            String turnAround = sc.next();
            System.out.println(getWay(turnAround));
        }
    }

    public static String getWay(String turnAround){
        int num = 0;
        String result = "";
        char[] chars = turnAround.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'L'){
                num--;
            }else {
                num++;
            }
        }
        int way = num%4;
        switch (way){
            case 0: result = "N"; break;
            case 1: result = "E"; break;
            case 2: result = "S"; break;
            case 3: result = "W"; break;
            case -1: result = "W"; break;
            case -2: result = "S"; break;
            case -3: result = "E"; break;
        }
        return result;
    }
}
