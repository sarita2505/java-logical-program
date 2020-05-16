package com.java.array;

import java.util.Arrays;

public class CompareTwoArray {
    public static void main(String[] args) {
//usingForLoop();
        usinEquals();
    }

    public static void usingForLoop() {
        Boolean is_equal = false;
        Integer[] a1 = new Integer[]{2, 3, 5, 6};
        Integer[] a2 = new Integer[]{3, 2, 6, 5};

        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        for (int i = 0; i < a1.length; i++) {
            if (a1[i].equals(a2[i])) {
                is_equal = true;
            } else {
                is_equal = false;
            }
        }
        System.out.println("both are equal true or false: " + is_equal);
    }

    public static void usinEquals() {
        Boolean is_equal = false;
        Integer[] a1 = new Integer[]{2, 3, 5, 6};
        Integer[] a2 = new Integer[]{3, 2, 6, 5};
        Arrays.sort(a1);
        Arrays.sort(a2);
        is_equal = Arrays.equals(a1,a2);
        System.out.println("both are equal true or false: " + is_equal);
    }
}
