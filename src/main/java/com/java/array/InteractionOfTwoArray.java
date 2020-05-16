package com.java.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InteractionOfTwoArray {
    public static void main(String[] args) {
        //intersectionByForLoop();
        intersectionBySet();
    }

    public static void intersectionByForLoop() {
        Integer[] a1 = new Integer[]{1, 2, 3, 4, 5};
        Integer[] a2 = new Integer[]{6, 7, 8, 9, 1, 2, 3};
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if (a1[i].equals(a2[j])) {
                    integers.add(a1[i]);
                }
            }
        }
        System.out.println("intersection of 2 array is: " + integers);
    }

    public static void intersectionBySet() {
        Integer[] a1 = new Integer[]{1, 2, 3, 4, 5};
        Integer[] a2 = new Integer[]{6, 7, 8, 9, 1, 2};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(a1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(a2));
        System.out.println(set1);
        System.out.println(set2);
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
