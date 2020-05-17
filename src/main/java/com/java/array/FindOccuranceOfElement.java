package com.java.array;

import java.util.HashMap;

public class FindOccuranceOfElement {
    public static void main(String[] args) {
        findOccurances(new Integer[]{1, 2, 3, 1, 4, 3, 2, 1});
    }

    public static void findOccurances(Integer[] integers) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer value : integers) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }

        }
        System.out.println(map);
    }
}
