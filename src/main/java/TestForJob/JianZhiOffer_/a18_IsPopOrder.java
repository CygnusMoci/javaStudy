package TestForJob.JianZhiOffer_;

import java.util.Stack;

/**
 * @author moci
 * @create 2018-03-12 10:53
 **/
public class a18_IsPopOrder {
    public static void main(String[] args) {

    }

    public  static boolean IsPopOrder(int[] pushA,int[] popA){
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int j = 0;
        for (int i = 0; i < popA.length; i++) {
            stack.push(pushA[i]);
            while (j < popA.length && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }

        }
        return stack.empty() ? true : false;
    }
}
