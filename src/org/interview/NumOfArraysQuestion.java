package org.interview;

import java.util.Arrays;

/**
 * @author ksipe
 */
public class NumOfArraysQuestion {

    public static void main(String[] args) {

        System.out.println("************** Integers");
        Integer[] integers = new Integer[]{1, 2, 3};
        System.out.println(Arrays.asList(integers));
        System.out.println(Arrays.asList(integers).size());

        System.out.println("************** Integers as Objects ref");
        Object[] objects = new Integer[]{1, 2, 3};
        System.out.println(Arrays.asList(objects));
        System.out.println(Arrays.asList(objects).size());

        System.out.println("************** Strings");
        String[] strings = {"1", "2", "3"};
        System.out.println(Arrays.asList(strings));
        System.out.println(Arrays.asList(strings).size());

        System.out.println("************** int");
        Object ints = (new int[]{1, 2, 3});
        System.out.println(Arrays.asList(ints));
        System.out.println(Arrays.asList(ints).size());
    }
}