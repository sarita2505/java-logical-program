package com.java.array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {
    public static void main(String[] args) {
        //byUsingForLOOp();
        byUsingSet();

    }

    public static void byUsingForLOOp() {
        String[] a = new String[]{"java", "c", "c++", "java", "python", "python"};
        System.out.println(a.length);
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    System.out.println("this is duplicated: " + a[j]);
                }
            }
        }
    }

    public static void byUsingSet() {
        Integer[] integers = new Integer[]{1, 1, 2, 2, 3, 4, 5, 5};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < integers.length; i++) {
            if (!set.add(integers[i])) {
                System.out.println("duplicate is :" + integers[i]);
            }
        }

    }
}
