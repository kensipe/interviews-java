package org.interview;

public class StringCompareExample {

    public static void main(String[] args) {

        // compare 1
        String x = "java";
        String y = "java";
        if (x == y) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are NOT equal");
        }

        // compare 2
        x = x.toUpperCase();
        y = y.toUpperCase();
        if (x == y) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are NOT equal");
        }

        // compare 3
        x = x.toUpperCase().intern();
        y = y.toUpperCase().intern();
        if (x == y) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are NOT equal");
        }
    }
}
