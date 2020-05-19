package com.java.array;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        //removeDuplicatesByLib(new Integer[]{1,1,2,3,2,4,4});
        removeDuplicatesBySet(new Integer[]{1, 2, 1, 2, 3, 4});
    }

    public static void removeDuplicatesByLib(Integer[] arr) {
        System.out.println("array is :" + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr = ArrayUtils.remove(arr, j);
                }
            }
        }
        System.out.println("array is :" + Arrays.toString(arr));
    }

    public static void removeDuplicatesBySet(Integer[] arr) {
        System.out.println("array before sorting: " + Arrays.toString(arr));
        Set<Integer> set = new HashSet<>();
        for (Integer a1 : arr) {
            set.add(a1);
        }
        System.out.println("set is :" + set);
//        Object[] a2;
//        a2= (Object[]) set.toArray();
//        System.out.println(" :"+Arrays.toString(a2));
        System.out.println(" array after sorting " + Arrays.toString(set.toArray()));
    }


}

