package thread.Mult_threadProgramming.ConcurrentHashMap;

import org.testng.Assert;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author moci
 * @create 2018-04-18 15:34
 **/
public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();

        map.put("张三",1);
        map.put("李四",2);
        map.put("王五",3);


        int num = map.get("王五");
        Assert.assertEquals(num,3);
        int size = map.size();
        Assert.assertEquals(size,3);

    }
}
