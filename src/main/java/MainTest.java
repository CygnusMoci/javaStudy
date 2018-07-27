
/**
 *
 * @author moci
 * @create 2018-01-18 9:29 AM
 **/
public  class MainTest  implements interfaceTest   {

    public static void main(String a[]) {
        int[] arr = new int[21];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        for (int i = 1; i <18 ; i++) {
            arr[i+3] = arr[i+2]+arr[i];
        }
        System.out.println(arr[20]);
    }
}