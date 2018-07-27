package TestForJob.niukeSimulatedTest_6_14;

import java.util.Scanner;

/**
 * 牛牛与妞妞闲来无聊，便拿出扑克牌来进行游戏。游戏的规则很简单，
 * 两个人随机抽取四张牌，四张牌的数字和最大的取胜（该扑克牌总张数为52张，
 * 没有大小王，A=1，J=11，Q=12，K=13，每种数字有四张牌），
 * 现在两人已经分别亮出了自己的前三张牌，牛牛想要知道自己要赢得游戏的概率有多大
 * @author moci
 * @create 2018-06-14 14:52
 **/
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[3];
        int[] a2 = new int[3];
        for (int i = 0; i <3; i++) {
            a1[i] = sc.nextInt();
        }for (int i = 0; i <3; i++) {
            a2[i] = sc.nextInt();
        }
    }
}
