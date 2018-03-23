package TestForJob.JianZhiOffer_book;


import java.util.Stack;

/**
 * @author moci
 * @create 2018-03-09 19:51
 **/
public class a3_StackForSort {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <10; i++) {
            int temp = (int)(Math.random()*10);
            stack.push(temp);
        }
        System.out.println(stack);
        System.out.println(StackForSort(stack));
        System.out.println(stack);
    }
    public static Stack StackForSort(Stack<Integer> stack){
        Stack<Integer>  stackHelp = new Stack<>();
        while(!stack.isEmpty()){
            int cur = stack.pop();
            while (!stackHelp.isEmpty()&&stackHelp.peek()<cur){
                stack.push(stackHelp.pop());
            }
            stackHelp.push(cur);
        }

        while (!stackHelp.isEmpty()){
            stack.push(stackHelp.pop());
        }
        return stackHelp;
    }
}
