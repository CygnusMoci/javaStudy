package test.sortingAlgorithm;

/**
 * @author moci
 * @create 2018-01-15 3:31 PM
 **/
public class ShellSort implements sortImpl {

    private String  sortName = "希尔排序";
    private int[] array;


    /**
     * 构造函数
     */
    public ShellSort() {
    }

    public ShellSort(int[] array) {
        this.array = array;
    }

    public int[] sort() {
        int k = array.length/2;//分组的增量
        int temp =0 ;
        int num =1;
        int x = 0;
        while(k>=1){
            for(int i=0;i<k;i++){//每组的起始位置
                for(int j=i+k;j<array.length;j+=k){//前后记录位置的增量是k，而不是1
                    x=j-k;
                    temp=array[j];
                    while(x>=i&&temp<array[x]){
                        array[x+k]=array[x];//移动的增量是k不是1
                        x-=k;
                    }
                    array[x+k]=temp;
                }
            }
            k=k/2;
            MainClass ma = new MainClass();
            System.out.println("第"+num+++"次移动:");
            ma.printArray(array);
        }
        return array;

    }

    public void sortName() {
        System.out.println("这个排序的算法名是: " +sortName);
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
