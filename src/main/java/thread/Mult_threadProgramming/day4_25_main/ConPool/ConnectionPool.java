package thread.Mult_threadProgramming.day4_25_main.ConPool;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.*;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * 数据库连接池示例
 * @author moci
 * @create 2018-04-25 15:13
 **/
public class ConnectionPool {
    //定义一个连接池
    private LinkedList<Connection> pool = new LinkedList<>();

    //通过构造函数初始化连接池的最大上限
    public ConnectionPool(int initialSize) {
        if(initialSize>0){
            for (int i = 0; i < initialSize; i++) {
                pool.addLast(ConnectionDriver.createConnection());
            }
        }
    }
    public void releaseConnextion(Connection connection){
        if(connection!=null){
            synchronized (pool){
                //连接释放后需要进行通知，这样其他消费者能够感知到连接池中已经归还了一个链接
                pool.addLast(connection);
                pool.notifyAll();
            }
        }
    }

    //在mills内无法获取到链接，将会返回null
    public Connection fetchConnextion(long mills) throws InterruptedException{
        synchronized (pool){
            //完全超时的情况
            if(mills<0){
                while (pool.isEmpty()){
                    pool.wait();
                }
                return pool.removeFirst();
            }else {
                long future = System.currentTimeMillis() + mills;
                long remaining = mills;
                while(pool.isEmpty()&&remaining>0){
                    pool.wait(remaining);
                    remaining = future - System.currentTimeMillis();
                }
                Connection result = null;
                if(!pool.isEmpty()){
                    result = pool.removeFirst();
                }
                return  result;
            }

        }
    }


}
