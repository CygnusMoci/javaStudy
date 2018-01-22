package test.sortingAlgorithm;


import java.util.Scanner;

/**
 * @author moci
 * @create 2017-12-28 5:23 PM
 **/
public class MainClass {

    public static final int testMax = 100;//测试数组最大值
    public static final int testNum = 20; //测试数组元素个数
    public static final int arrayA[] = randmArray(testMax,testNum);
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("原始数组：");
        printArray(arrayA);
        System.out.println("输入数字 对上述数组进行从小到大排序");
        while (sc.hasNext()){
            int sw = sc.nextInt();
            for (int i = 0; i <arrayA.length; i++) {
            }
            switch (sw){
                case 1:
                    useInserSort(); //插入排序
                    break;
                case 2:
                    useShellSort(); //希尔排序
                    break;
                case 3:
                    useMaoPaoSort();//冒泡排序
                    break;
                default:
                    System.out.println("算法尚未完成");
            }
            System.out.println("原始数组：");
            printArray(arrayA);
        }
    }


    public static void useMaoPaoSort(){
        int[] array = arrayA.clone();
        new maoPaoSort().sortName();
        long startTime=System.currentTimeMillis();
        new maoPaoSort(array).sort();
        long endTime=System.currentTimeMillis();
        System.out.println("排序时间: "+(endTime-startTime)+" ms ");
    }



    public static void useShellSort(){
        int[] array = arrayA.clone();
        new ShellSort().sortName();
        long startTime=System.currentTimeMillis();
        new ShellSort(array).sort();
        long endTime=System.currentTimeMillis();
        System.out.println("排序时间: "+(endTime-startTime)+" ms ");
    }


    /**
     * 直接插入排序
     */
    public static void useInserSort(){
        int[] array = arrayA.clone();
        new insertSort().sortName();
        long startTime=System.currentTimeMillis();
        new insertSort(array).sort();
        long endTime=System.currentTimeMillis();
        System.out.println("排序时间: "+(endTime-startTime)+" ms ");
    }


    /**
     * 随机生成n以内的整数数列
     * @param arrayLength
     * @param n
     * @return
     */
    public static int[] randmArray(int n,int arrayLength){
        int[] array = new int[arrayLength];
        int randmMeta;
        for (int i = 0; i <array.length; i++) {
            randmMeta = (int) (n*Math.random());
            array[i] = randmMeta;
        }
        return array;
    }

    /**
     * 生成标准倒序数列
     * @param arrayLength
     * @return
     */
    public static int[] standardArray(int arrayLength){
        int[] array = new int[arrayLength];
        for (int i = 0; i <array.length; i++) {
            array[i] = arrayLength-i;
        }
        return array;

    }

    /**
     * 输出数列
     * @param array
     */
    public static void printArray(int array[]){
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
            if((i+1)%10==0){
                System.out.println();
            }
        }
    }



}
