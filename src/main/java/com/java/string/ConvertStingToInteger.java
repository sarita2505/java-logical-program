package com.java.string;

public class ConvertStingToInteger {
    public static void main(String[] args) {
       // convertStringToInteger("abc");//number format exception
        convertStringToInteger("123");
    }
    public static void convertStringToInteger(String s){
        Integer value=Integer.parseInt(s);
        System.out.println(value);
        Integer val=Integer.valueOf(s);
        System.out.println(val);
    }
}
