package TestForJob.W163;

import java.util.Scanner;

/**
 * 利用合并来创造回文序列，这里只要求输出次数，就可以不用额外的数据结构来储存回文序列
 * 具体思路是通过头尾指针的不断合并，哪边小就合并哪边，一样的话就向中间靠拢，直到退出循环
 * @author moci
 * @create 2018-04-27 12:49
 **/
public class a13_huiwen{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int times = 0;
            int n = scanner.nextInt();
            int[] inputArr = new int[n];
            for(int i = 0; i < n; i++){
                inputArr[i] = scanner.nextInt();
            }
            int head = 0;
            int tail = n - 1;
            while(head < tail){
                if(inputArr[head] > inputArr[tail]){
                    inputArr[--tail] += inputArr[tail + 1];
                    times++;
                }else if(inputArr[head] < inputArr[tail]){
                    inputArr[++head] += inputArr[head - 1];
                    times++;
                }else{
                    head++;
                    tail--;
                }
            }
            System.out.println(times);
        }
        scanner.close();
    }
}
