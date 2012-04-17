package org.interview.codereview;

import java.util.Arrays;

/**
 * @author ksipe
 */
public class NumOfArrays {

    public static void main(String[] args) {

        System.out.println(Arrays.asList(new Integer[] {1, 2, 3}).size());
        System.out.println(Arrays.asList(1, 2, 3).size());
        System.out.println(Arrays.asList(new int[] {1, 2, 3}).size());


        System.out.println("************** Integer");
        Object[] Iobj = new Integer[] {1, 2, 3};
        System.out.println(Iobj);
        System.out.println(Arrays.asList(Iobj));
        System.out.println(Arrays.asList(new Integer[] {1, 2, 3}));
        System.out.println(Arrays.asList(new Integer[] {1, 2, 3}).size());

        System.out.println("************** int");
        Object obj = (new int[]{1, 2, 3});

        // fails
//        Object[] obj = (new int[]{1, 2, 3});
        System.out.println(obj);
        System.out.println(Arrays.asList(obj));
        System.out.println(Arrays.asList(obj).size());
        System.out.println(Arrays.asList(new int[]{1, 2, 3}).size());

    }
}
