package com.java.array;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{4, 5, 1, 2, 3, 3};
        quickSort(integers, 0, integers.length - 1);
        System.out.println(Arrays.toString(integers));
    }

    public static void quickSort(Integer[] arr, int start, int end) {

        if (start < end) {
            int partition = partition(arr, start, end);
            quickSort(arr, start, partition - 1);
            quickSort(arr, partition + 1, end);
        }
// int partition = partition(arr, start, end);
//        if(partition-1>start) {
//            quickSort(arr, start, partition - 1);
//        }
//        if(partition+1<end) {
//            quickSort(arr, partition + 1, end);
//        }
    }

    public static int partition(Integer[] arr, int start, int end) {
        int pivot = arr[end];

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }
}
