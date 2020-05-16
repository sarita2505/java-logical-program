package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convertion {
    public static void main(String[] args) {

        // converArrayListToArray();
        convertArrayToArrayList();
    }

    public static void converArrayListToArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("list of integerss: " + arrayList);
        Integer[] array = new Integer[arrayList.size()];
        arrayList.toArray(array);
        for (Integer i : array) {
            System.out.println(i);
        }
    }

    public static void convertArrayToArrayList() {
        String[] strings = new String[]{"x", "y", "z"};
        System.out.println("array is:" + Arrays.toString(strings));
        List<String> list = new ArrayList<String>(Arrays.asList(strings));
        System.out.println("list is: " + list);
    }
}
