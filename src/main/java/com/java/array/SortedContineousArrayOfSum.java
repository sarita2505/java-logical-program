package com.java.array;

public class SortedContineousArrayOfSum {
    public static void main(String[] args) {
       findContineousArray(new Integer[]{1,10,2,3,4,10}, 14);
       // findContineousArray(new Integer[]{7, 1, 2, 4, 5}, 10);
    }

    public static void findContineousArray(Integer[] integers, Integer required_sum) {
        Integer curr_sum = 0;
        Integer rp = 0;
        Integer lp = 0;
        for (int i = 0; i < integers.length; i++) {

            if (curr_sum < required_sum) {
                curr_sum = curr_sum + integers[lp];
                System.out.println("current sum is " + curr_sum);
                lp++;
                System.out.println("left pointer is" + lp); }

            if (curr_sum > required_sum) {
                curr_sum = curr_sum - integers[rp];
                System.out.println("current sum is " + curr_sum);
                rp++;
                System.out.println("right pointer is " + rp);
            }
            if (curr_sum == required_sum) {
                for (int j = rp; j < lp; j++) {
                    System.out.println("value is :"+j);
                }
            }

        }

    }
}
