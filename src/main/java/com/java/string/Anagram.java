package com.java.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        checkForAnagram("sarita","rtisaa");
    }
    public static void checkForAnagram(String s1,String s2){
        char[] c1=s1.toCharArray();
        char[] c2=s1.toCharArray();
        if (s1.length()!=s2.length()){
            System.out.println("two strings are not anagram :");
        }
       else if (Arrays.equals(c1,c2)==true){
            System.out.println("2 strings are anagram");
        }else {
            System.out.println("two strings are not anagram");
        }
    }
}
