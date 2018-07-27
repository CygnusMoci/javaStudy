package test.sortingAlgorithm;

import java.io.BufferedReader;

/**
 * @author moci
 * @create 2018-01-16 3:40 PM
 **/
public class maoPaoSort implements sortImpl {

    private String sortName = "冒泡排序";
    private int[] array;


    public maoPaoSort() {
    }

    public maoPaoSort(int[] array){
        this.array = array;
    }


    /**
     * 算法实现
     * @return
     */
    public int[] sort() {
        int len = array.length;
        int num =1;
        int temp = 0;
        for (int i = 0; i < len-1; i++) {
            for (int j = i; j <len; j++) {
                if(array[i]>array[j]){
                    temp =array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

            MainClass ma = new MainClass();
            System.out.println("第"+num+++"次移动:");
            ma.printArray(array);

        }
        return array;
    }




    public void sortName() {
        System.out.println("这个排序的算法名是: " +sortName  );
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
