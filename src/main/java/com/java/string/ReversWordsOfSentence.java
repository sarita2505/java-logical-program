package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversWordsOfSentence {
    public static void main(String[] args) {
        //reversAString("i am sarita panda");
        //byUsingStringBuffer("i am sarita panda");
        //byList("i am sarita");
        bySwapping("i am sarita panda");
    }
    public static void reversAString(String str){
        String[] s1=str.split(" ");
        System.out.println( "length of array"+s1.length);
      String result=s1[s1.length-1];
        for (Integer i=s1.length-2;i>=0;i--)
        {
            result=result+s1[i];
        }

        System.out.println(Arrays.toString(s1));
        System.out.println(result);
    }
    public static void byUsingStringBuffer(String s){
        String[] strings=s.split(" ");
        String result;
        StringBuffer buffer=new StringBuffer();
        for (int i=strings.length-1;i>=0;i--) {
            buffer.append(strings[i]);
            buffer.append(" ");
        } System.out.println("reversed string is :"+buffer);
    }
    public static void byList(String s){
        String[] strings=s.split(" ");
        List<String> list=new ArrayList<String>(Arrays.asList(strings));
        Collections.reverse(list);
        System.out.println(list);
        StringBuilder builder=new StringBuilder(list.size());
        for (String s1:list) {
            builder.append(s1);
            builder.append(" ");
        }
        System.out.println(builder);
    }
    public static void bySwapping(String s){
        String[] s1=s.split(" ");
        String temp;
        int start=0;
        int end=s1.length-1;
        for (int i=0;i<end;i++){
            temp=s1[start];
            s1[start]=s1[end];
            s1[end]=temp;
            start++;
            end--;
        }
        System.out.println("result is:"+Arrays.toString(s1));
        for (String s2:s1) {
            System.out.print(s2);
            System.out.print(" ");
        }
    }
}
