package thread.Mult_threadProgramming.AtomicIntegerFieldUpdater;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @author moci
 * @create 2018-05-07 12:09
 **/
public class AtomicIntegerFieldUpdaterTest {
    //创新原子更新器，并且设置对象类与要更新的字段
    private static AtomicIntegerFieldUpdater<User> a = AtomicIntegerFieldUpdater.newUpdater(User.class,"old");


    public static void main(String[] args) {
        User conan = new User("conan",16);
        System.out.println(a.getAndIncrement(conan));
        System.out.println(a.get(conan));
    }

    static class User{
        private String name;
        public volatile int old;
        public User(String name,int old){
            this.name = name;
            this.old = old;
        }

        public String getName(){
            return name;
        }
        public int getOld(){
            return old;
        }
    }
}