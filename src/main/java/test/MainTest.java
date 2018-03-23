package test;

import test.sortingAlgorithm.maoPaoSort;

/**
 * @author moci
 * @create 2018-01-18 9:29 AM
 **/
public class MainTest {

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        String str=String.valueOf(456121213);
        char [] chars=str.toCharArray();
        long endTime=System.currentTimeMillis();
        System.out.println("排序时间: "+(endTime-startTime)+" ms ");
        System.out.println(chars);
    }
}

