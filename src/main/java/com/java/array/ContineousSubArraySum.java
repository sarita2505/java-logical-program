package com.java.array;

import java.util.HashMap;

public class ContineousSubArraySum {
    public static void main(String[] args) {

        findSubArray(new Integer[]{42, 15, 12, 8, 6, 32}, 26);
    }

    public static void findSubArray(Integer[] integers, Integer target) {
        Integer result = 0;
        Integer finalResult = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prev = 0;
        for (int i = 0; i < integers.length; i++) {
            int current = prev + integers[i];
            map.put(current, i);
            prev = current;
            System.out.println(map.put(integers[i], i));
            result = prev - target;
            if (map.containsKey(result)) {
                System.out.println("subset is: " + map.get(integers[i]));
                finalResult = map.get(result);
                System.out.println("start :" + (finalResult + 1));
                System.out.println("end :" + i);
                break;
            }

        }
    }
}
