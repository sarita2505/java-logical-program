package com.java.string;

import com.sun.corba.se.impl.legacy.connection.USLPort;

public class Palindrom {
    public static void main(String[] args) {
        //intPalindrom(121);
        //stringPalindrom("abcdba");
        strPalindrom("abcmadamcba");
    }
    public static void intPalindrom(int n){
        int temp;
        int r;
        int sum=0;
        temp=n;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum){
            System.out.println("it is a palindrom");
        }
        else {
            System.out.println("it is not a palindrom");
        }
    }
    public static void stringPalindrom(String s){
        String temp=s;
        char[] chars=s.toCharArray();
        int start=0;
        int end=s.length()-1;

        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(chars[i]==chars[j]){

            }
            else {
                System.out.println("not a palindrom");
                break;
            }
            if (j-i>1){

                i++;
                j--;
            }
            if (j-i==1 || i==j){
                System.out.println("p");
                break;
            }

        }
        System.out.println(i);
        System.out.println(j);

    }
    public static void strPalindrom(String s){
        boolean flag=false;
        String temp=s;
        char[] chars=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while (start<end){
            if(chars[start]==chars[end]){
                start++;
                end--;
                flag=true;
            }
            else {
                //System.out.println("it is not a palindrom");
                flag=false;
                break;
            }
        }
        if (flag==true)
        {
            System.out.println("it is a palindrom :"+s);
        }
        else {
            System.out.println("not");
        }
//        System.out.println("it is a palindrom"+s);
    }
}
