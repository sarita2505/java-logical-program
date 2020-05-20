package com.java.array;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        findLargestAndSmallest(new Integer[]{10,2,3,4,-5,100});
    }
    public static void findLargestAndSmallest(Integer[] a){
        Integer max=a[0];
        Integer min=a[0];
        for (Integer value:a) {
            if (value>max){
                max=value;
            }
            else if(value<min){
                min=value;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
