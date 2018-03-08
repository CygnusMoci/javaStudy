package DataStructure.StackAndQueue;

import java.util.Stack;

/**
 * @author moci
 * @create 2018-03-07 16:57
 **/
public class a2_twoStackForAQueue {
    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6};
        TwoStackQueue test = new TwoStackQueue();
        test.push(array);
        for (int i = 0; i <array.length; i++) {
            test.pop();
        }

    }
    public static class TwoStackQueue{
        private Stack<Integer> stackPush;
        private Stack<Integer> stackPop;

        TwoStackQueue(){
            this.stackPop = new Stack<>();
            this.stackPush = new Stack<>();
        }

        public void push(int[] array){
            for (int i = 0; i <array.length; i++) {
                stackPush.push(array[i]);
            }
            if(stackPush.isEmpty()){
                throw new RuntimeException("This queue is empty!");
            }else{
                int temp = stackPush.size();
                for (int i = 0; i <temp; i++) {
                    stackPop.push(stackPush.peek());
                    stackPush.pop();
                }
            }
        }
        public void pop(){
            if(stackPop.isEmpty()){
                throw new RuntimeException("This queue is empty!");
            }else {
                    stackPop.pop();
            }
        }
    }
}
