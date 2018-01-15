package test.sortingAlgorithm;

/**
 * 插入排序
 * @author moci
 * @create 2018-01-15 11:04 AM
 **/
public class insertSort implements sortImpl {

    private String sortName = "插入排序";
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
        for (int i = 1; i <this.array.length; i++) {
            int j = i-1; //作为移动的基准
            int temp = this.array[i];

            while (j>=0&&temp<this.array[j]){
                this.array[j+1] = this.array[j];
                j--;
            }
            result[j+1] = temp;
        }

        return result;
    }

    /**
     * 打印算法名字
     */
    public void sortName() {
        System.out.println("这个排序算法的名字是: "+this.sortName);
    }

    public void printOut() {
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]+ " ");
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}