package com.java.string;

import java.util.Arrays;

public class ReversAString {
    public static void main(String[] args) {
        //reversStringUsingStringBuilder("sarita");
        usingLoop("sarita");
    }
    public static void reversStringUsingStringBuilder(String s){
        StringBuilder builder=new StringBuilder(s);
        builder.reverse();
        System.out.println(builder);
    }
    public static void usingLoop(String s){
       char[] chars= s.toCharArray();
       char temp;
       int start=0;
       int end=chars.length-1;
       for (int i=0;i<=end;i++){
           temp=chars[i];
            chars[start]=chars[end];
           chars[end]=temp;
           start++;
           end--;
       }
        System.out.println(Arrays.toString(chars));
    }
}
