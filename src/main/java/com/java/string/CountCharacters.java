package com.java.string;

import org.apache.commons.lang3.StringUtils;

public class CountCharacters {
    public static void main(String[] args) {
        //countChars("sarita panda");
        charCountByStringUtils("sarita panda");
    }
    public static void countChars(String s){
        int count=0;
        for (char ch:s.toCharArray()) {
           // System.out.println(ch);
            count++;
        }
        System.out.println(count);
    }
    public static void charCountByStringUtils(String s){
        System.out.println(StringUtils.countMatches(s,"a"));
        System.out.println(com.sun.xml.internal.ws.util.StringUtils.capitalize(s));
    }
}
