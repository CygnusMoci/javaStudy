package DataStructure.StackAndQueue;


import java.util.Stack;


/**
 * 设计一个特殊的栈，实现基础功能，返回最小元素的操作
 * @author moci
 * @create 2018-03-07 15:19
 **/
public class a1_getMinStack {
    public static void main(String[] args) {
        Mystack1 stack = new Mystack1();
        int[] array = new int[]{3,4,5,1,1};
        for (int i = 0; i <array.length; i++) {
            stack.push(array[i]);
            int temp = stack.getmin();
            System.out.println(temp);
        }
        for (int i = 0; i <array.length-1; i++) {
            stack.pop();
            int temp = stack.getmin();
            System.out.println(temp);
        }
    }

    public static class Mystack1{
        private Stack<Integer> stackData;
        private Stack<Integer> stackMin;

        public Mystack1(){
            this.stackData = new Stack<>();
            this.stackMin = new Stack<>();
        }

        /**
         * 压入
         * @param newNum
         */
        public void push(int newNum){
            if(this.stackMin.isEmpty()){
                this.stackMin.push(newNum);
            }else if(newNum<=this.getmin()){
                this.stackMin.push(newNum);
            }
            this.stackData.push(newNum);
        }

        /**
         * 弹出
         */
        public int pop(){
            if(this.stackData.isEmpty()){
                throw new RuntimeException("Your Stack is empty!");
            }
            int tempValue = this.stackData.pop();
            if (tempValue == this.getmin()){
                this.stackMin.pop();
            }
            return tempValue;
        }

        /**
         * 设置getmin是为了加上判断是非为空
         * @return
         */
        public int getmin(){
            if(this.stackMin.isEmpty()){
                throw new RuntimeException("Your Stack is empty!");
            }
            return this.stackMin.peek();
        }
    }

}




