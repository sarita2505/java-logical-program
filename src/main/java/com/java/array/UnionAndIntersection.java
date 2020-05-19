package com.java.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public static void main(String[] args) {
        Integer[] a1 = new Integer[]{1, 2, 2, 3, 4, 5};
        Integer[] a2 = new Integer[]{5, 6, 7};
        Integer[] a3 = new Integer[]{8, 6, 9, 10, 5};
        arrayUnion(a1, a2, a3);
        arrayIntesection(a1, a2, a3);

    }

    public static void arrayUnion(Integer[]... arr) {
        Set<Integer> set = new HashSet<>();
        for (Integer[] a : arr) {
            System.out.println(Arrays.toString(a));
            for (Integer value : a) {
                set.add(value);
            }
        }
        System.out.println(set);
    }

    public static void arrayIntesection(Integer[]... arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr[0]));
        for (Integer i = 1; i < arr.length; i++) {
            Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(arr[i]));
            set.retainAll(set2);
        }
        System.out.println("after intersection" + set);

    }
}
