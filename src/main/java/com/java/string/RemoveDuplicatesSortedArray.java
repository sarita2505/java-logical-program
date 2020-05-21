package com.java.string;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        removeDuplicates(new Integer[]{1,2,2,3,3,4,5});
        //aaabbbccdd:abcd
    }
    public static void removeDuplicates(Integer[] a){
        Integer[] b=new Integer[a.length];
       // int prev=a[0];
        int j=0;
        for (int i=0;i<a.length-1;i++){
            if (a[i]!=a[i+1]){
                b[j]=a[i];
                j++;
            }


        }
        System.out.println(Arrays.toString(b));
    }
}
