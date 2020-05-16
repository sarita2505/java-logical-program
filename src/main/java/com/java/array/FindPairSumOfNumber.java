package com.java.array;

public class FindPairSumOfNumber {
    public static void main(String[] args) {
        findPairsWhoseSumEqualsToNumber(5);
    }

    public static void findPairsWhoseSumEqualsToNumber(Integer number) {
        Integer[] a1 = new Integer[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < a1.length; i++) {
            for (int j = 1; j < a1.length; j++) {
                if (a1[i] + a1[j] == number) {
                    System.out.println("the pair is " + a1[i] + " and " + a1[j] + " whose sum is " + number);
                }
            }
        }
    }
}
