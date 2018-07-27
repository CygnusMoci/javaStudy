import java.util.Set;
import java.util.Stack;

/**
 * @author moci
 * @create 2018-01-31 9:39 AM
 **/
public class entity {


    public  String[] id;
    // 一个类要被继承，必须提供无参构造器
    entity(){}
    entity(int i){}

    public void say(){
        id = new String[]{"123","33"};
        System.out.println("我是entity");
    }
    private void sayPrivate(){
        System.out.println("这是private方法");

    }



}
