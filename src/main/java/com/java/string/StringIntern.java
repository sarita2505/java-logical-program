package com.java.string;
//whenever we write new String 2 objects are got created one is stored in string constant pool and other is in heap memory
//and its refference will always search the variable in heap
//but whenever we create a string by assigning str it always store and search that object in string constant pool
//the intern() search the new obj in string constant pool
public class StringIntern {
    public static void main(String[] args) {
        strIntern();
    }
    public static void strIntern(){
        String s=new String("abc");
        String s1="abc";
        String s2=new String("abc");
        String s3="abc";
        System.out.println("before interns and s1");
        System.out.println(s==s1);
        s=s.intern();
        System.out.println("after intern of s and s1");
        System.out.println(s==s1);
        System.out.println("comp of s1 and s2");
        System.out.println(s1==s2);
        System.out.println("comp between s1 and s3");
        System.out.println(s1==s3);
    }

}
