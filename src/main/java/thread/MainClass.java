package thread;

/**
 * @author moci
 * @create 2017-12-28 5:23 PM
 **/
public class MainClass {
    public static void main(String[] args) {

        new station().start();
        new station().start();
        new station().start();
        new station().start();
    }
}
