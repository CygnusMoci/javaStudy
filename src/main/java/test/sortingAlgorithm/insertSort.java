package test.sortingAlgorithm;

/**
 * 插入排序
 * @author moci
 * @create 2018-01-15 11:04 AM
 **/
public class insertSort implements sortImpl {

    private String sortName = "插入排序";
    private int _ = 5;
    private int[] array;


    /**
     * 构造函数
     */
    public insertSort() {
    }

    public insertSort(int[] array) {
        this.array = array;
    }

    /**
     * 算法1
     *
     */
    public int[] sort() {
        int result[] = this.array;
        int num =1;
        for (int i = 1; i <this.array.length; i++) {
            int j = i-1; //作为移动的基准
            int temp = this.array[i];
            while (j>=0&&temp<this.array[j]){
                this.array[j+1] = this.array[j];
                j--;
            }
            result[j+1] = temp;
            MainClass ma = new MainClass();
            System.out.println("第"+num+++"次移动:");
            ma.printArray(array);
        }

        return result;
    }

    /**
     * 算法2,书上的经典写法.
     * @param a
     * @param n
     * @param <T>
     */

    public static <T extends Comparable<? super T>> void selectionSort(T[] a,int n){
        for (int index = 0; index < n - 1; index++) {
            //外循环比较
            int indexOfNextSmallest = getIndexOfNextSmallest(a,index,n-1);
            swap(a,index,indexOfNextSmallest);
        }
    }

    private static <T extends Comparable<? super T>> int getIndexOfNextSmallest(T[] a,int first,int last){
        T min = a[first];
        int indexOfMin = first;
        for (int index = first+1; index <=last ; index++) {
            //内循环比较,从头开始 i = 1;
            //交换大小
            if(a[index].compareTo(min)<0){
                min = a [index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }

    private static void swap(Object[] a, int i, int j){
        Object temp = a[i] ;
        a[i] = a[j];
        a[j] = temp;
    }



    /**
     * 打印算法名字
     */
    public void sortName() {
        System.out.println("这个排序算法的名字是: "+this.sortName);
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
