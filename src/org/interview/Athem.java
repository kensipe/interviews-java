package org.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ksipe
 */
public class Athem {

    // todo:  future questions... test Palindrome and sort days of weeks

//
//    // good
//    public static String[] sort(String[] daysOfWeek) {
//
//
//        if (daysOfWeek == null || daysOfWeek.length == 0) {
//            return new String[0];
//        }
//
//        String[] definedOrder = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
//
//        List<String> daysList = new ArrayList<String>(daysOfWeek.length);
//
//
//        for (int index = 0; index < definedOrder.length; index++) {
//
//            for (int j = 0; j < daysOfWeek.length; j++) {
//                if (daysOfWeek[j].equals(definedOrder[index])) {
//                    daysList.add(daysOfWeek[j]);
//                }
//            }
//        }
//
//        String[] sortedDays = daysList.toArray(new String[daysOfWeek.length]);
//
//
//        return sortedDays;
//
//    }
//
//    public static void main(String[] args) {
////
////        String[] days = {"SATURDAY", "TUESDAY", "WEDNESDAY"};
////
////        String[] out = sort(days);
////        for (String v: out) {
////            System.out.println("v = " + v);
////        }
//
////        String palin = "Madam, I'm Adam";
////        System.out.println(isPalindrome(palin));
////        System.out.println(isPalindrome("dad"));
////        System.out.println(isPalindrome(""));
////        System.out.println(isPalindrome(" "));
////        System.out.println(isPalindrome("Go hang a salami, I'm a lasagna hog."));
////        System.out.println(isPalindrome("Nope!"));
//
//
//        int[] values = {1, -2, 3, 4};
//        int[] valX = {};
//        System.out.println(sumOfArray(values));
//
////        System.out.println(isPrimeNumber(29));
//
//    }
//
//	// bad
//	// http://users.dickinson.edu/~braught/courses/cs132s03/code/Palindrome.src.html
//    public static boolean isPalindrome(String value) {
//
//
//        if (value == null)
//            return false;
//
//        String cleanvalue = value.replaceAll("[^a-zA-Z]", "").toLowerCase();
//
//        StringBuilder builder = new StringBuilder(cleanvalue.length());
//        for (int i = cleanvalue.length() - 1; i >= 0; i--) {
//            builder.append(cleanvalue.charAt(i));
//        }
//
//        String reversed = builder.toString();
//
//        return cleanvalue.equals(reversed);
//    }
//
//
//	// good
//    public static String reverse(String value) {
//
//        if (value == null)
//            return "";
//
//        StringBuilder builder = new StringBuilder(value.length());
//        for (int i = value.length() -1; i >= 0; i--) {
//            builder.append(value.charAt(i));
//        }
//
//        return builder.toString();
//    }
//
//	// good
//    public static boolean isPrimeNumber(int value) {
//        if (value == 2)
//            return true;
//        if (value % 2 == 0)
//            return false;
//
//        for (int i = 3; i * i <= value; i += 2) {
//            if (value % i == 0)
//                return false;
//        }
//        return true;
//
//
//    }
//
//    public static int sumOfArray(int[] values) {
//
//        if(values == null || values.length < 1)
//            return 0;
//
//        int total = 0;
//        for (int value: values) {
//            total += value;
//        }
//
//        return total;
//    }
//    
}
