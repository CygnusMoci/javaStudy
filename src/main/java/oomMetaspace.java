import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * @author moci
 * @create 2018-01-18 9:29 AM
 **/
public  class oomMetaspace  {

    public static void main(String[] args) {
        int i = 0;
        try {
            for (;;){
                i++;
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(oom.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        return new Object();
                    }
                });
                enhancer.create();
            }
        }catch (Exception e){
            System.out.print("第"+i+"次时候发生异常");
            e.printStackTrace();
        }
    }

    static class oom{}
}