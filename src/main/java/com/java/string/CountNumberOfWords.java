package com.java.string;

import java.util.StringTokenizer;

public class CountNumberOfWords {
    public static void main(String[] args) {
        countNumberOfWords("sarita panda");
    }

    public static void countNumberOfWords(String str) {
        String[] strings = str.split(" ");
        char[] chars;
        int count = 0;
        System.out.println("size of string with spaces :" + str.length());
        System.out.println("size of string without spaces: " + strings.length);
        StringTokenizer tokenizer = new StringTokenizer(str);
        System.out.println("count words of a string by tokenizer :"+tokenizer.countTokens());
        System.out.println("count each chars of a string :==");
        for (String s:strings) {
            chars=s.toCharArray();
            for (char c:chars) {
                count++;
            }
        }System.out.println("count each words in string is:"+count);
    }
}
