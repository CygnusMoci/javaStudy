
/**
 * @author moci
 * @create 2018-04-17 15:58
 **/
public  interface interfaceTest {
     int aa =5;

    default void say(){
        System.out.println("接口");
    }

    public static void main(String[] args) {
        interfaceTest a = new interfaceTest(){};
        a.say();
    }
}
