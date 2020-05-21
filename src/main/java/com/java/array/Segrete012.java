package com.java.array;

import java.util.Arrays;

public class Segrete012 {
    public static void main(String[] args) {
segregate(new Integer[]{1,0,0,1,2,2,1,0});
    }

    public static void segregate(Integer[] a) {
        int low = 0;
        int mid = 0;
        int high = a.length - 1;
        int temp;
        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp=a[mid];
                    a[mid]=a[high];
                    a[high]=temp;
                    high--;
                    break;
            }

        } System.out.println(Arrays.toString(a));
    }
}
