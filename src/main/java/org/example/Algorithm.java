package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Algorithm for fib sequence
 *
 */
public class Algorithm {
    private static Map<Integer, Long> dictionary = new HashMap<>();

    public static long fib(int n) {
        if(n == 0) {
            return 0L;
        }

        if(n == 1) {
            return 1L;
        }

        return memo(n-1) + memo(n-2);
    }

    private static long memo(int m) {

        Long value = dictionary.get(m);

        if(value != null) {
            return value;
        }

        value = fib(m);
        dictionary.put(Integer.valueOf(m), value);
        return value;
    }

    public static void array(int arrayList) {

    }

    public static void main( String[] args ) {
        int[] arrayList = new int[4];
    /*
        for(int i = 0; i < arrayList.length; ++i) {
            System.out.print(Algorithm.fib(i));
        }

     */
        //see what fib num runs 0112 !!
        System.out.println(Algorithm.fib(5));
        System.out.println(Algorithm.fib(10));
        System.out.println(Algorithm.fib(20));
        System.out.println(Algorithm.fib(50));
        System.out.println(Algorithm.fib(100));

    }
}
