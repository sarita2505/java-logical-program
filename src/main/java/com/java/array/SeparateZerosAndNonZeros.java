package com.java.array;

import java.util.Arrays;

public class SeparateZerosAndNonZeros {
    public static void main(String[] args) {
        separateZerosAndNonZeros(new Integer[]{1,0,0,2,3,0,4});
        // separateZerosAndNonZeros(new Integer[]{1,2,0,3});
        //bySwapping(new Integer[]{1, 0, 0, 2, 3, 0, 4});
        //bySwapping(new Integer[]{0, 1, 0, 0, 3, 5, 4});
    }

    public static void separateZerosAndNonZeros(Integer a[]) {


        int j = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                j++;
                a[j] = a[i];
                System.out.println("value is: " + a[j]);
            }
        }
        while (j+1 < a.length) {
            a[j+1] = 0;
            j++;
        }

        System.out.printf("array is" + Arrays.toString(a));
    }

    public static void bySwapping(Integer a[]) {
        Integer temp = 0;
        Integer i = 0;
        Integer j = 0;
//        for (i=0;i<a.length;i++){
//            if (a[i]!=0){
//                temp=a[i];
//                 a[i]=a[j];
//                 a[j]=temp;
//                 j++;
//            }
//        }
        while (i < a.length) {
            if (a[i] != 0) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                j++;
            }
            i++;
        }
        System.out.printf("array is" + Arrays.toString(a));
    }
}
