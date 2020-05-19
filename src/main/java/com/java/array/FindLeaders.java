package com.java.array;

public class FindLeaders {
    public static void main(String[] args) {
        findLeaders(new Integer[]{9, 4, 3, 2, 7, 2});
    }

    public static void findLeaders(Integer[] a1) {
        // int last = a1.length - 1;
        int max = a1[a1.length - 1];
        System.out.println(max);
        for (int i = a1.length - 2; i >= 0; i--) {
            int current = a1[i];

            if (current > max) {

                max = current;
                System.out.println(max);
            }

        }
    }
}
