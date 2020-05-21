package com.java.string;

public class TwoStringsAreRotationOfEachOther {
    public static void main(String[] args) {
        checkTwoStringsAreRoatationOfEachOther("xyz","zxy");
        checkTwoStringsAreRoatationOfEachOther("xyz","zyx");
    }
    public static void checkTwoStringsAreRoatationOfEachOther(String s1,String rotation){
        String s=s1+s1;
        if (s.contains(rotation)){
            System.out.println("true");
        }
        else{
            System.out.println(false);
        }
    }
}
