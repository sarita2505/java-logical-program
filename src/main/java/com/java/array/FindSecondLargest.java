package com.java.array;

import java.util.Arrays;

public class FindSecondLargest {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1,5, 2, 3, 4, 5};
       Arrays.sort(a);
        System.out.println("the sorted array is :"+Arrays.toString(a));
        Integer large1;
        Integer large2;
        if (a[0] > a[1]) {
             large1 = a[0];
             large2 = a[1];
        } else {
             large1 = a[1];
             large2 = a[0];
        }
        for (int i = 2; i < a.length; i++) {
            if (a[i] > large1) {
                large2=large1;
                large1 = a[i];

            }
            else if (a[i] < large1 && a[i] > large2) {
                large2 = a[i];
            }

        }
        System.out.println("1st larger element :" + large1);
        System.out.println("2st larger element :" + large2);
    }
}
