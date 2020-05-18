package com.java.array;

import java.util.Arrays;

public class ReversArrayWithOutThirdArray {
    public static void main(String[] args) {
        reversArray(new Integer[]{1,2,3,4,5,6,7});
    }
    public static void reversArray(Integer a[]){
        Integer temp;
        Integer start=0;
        Integer last=a.length-1;
        while (start<last){
            temp=a[start];
            a[start]=a[last];
            a[last]=temp;
            start++;
            last--;
        }
        System.out.println(Arrays.toString(a));
    }
}
