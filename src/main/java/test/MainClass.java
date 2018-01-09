package test;

import sun.reflect.generics.tree.VoidDescriptor;

import java.util.Scanner;

/**
 * @author moci
 * @create 2017-12-28 5:23 PM
 **/
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(new StringBuffer(s).reverse().toString());
        }

    }

}
