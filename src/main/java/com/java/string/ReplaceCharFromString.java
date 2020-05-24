package com.java.string;

public class ReplaceCharFromString {
    public static void main(String[] args) {
        replaceChar("aarita not a good girl",'a','s');
    }
    public static void replaceChar(String string,char old,char targrt){
        System.out.println("string is: "+string);

        String result=string.replace(old,targrt);
        System.out.println("replaced string is: "+result);
        String result2=string.replace("not","is");
        System.out.println("replaced char sequesnce string is: "+result2);
        String result3=string.replaceFirst("a","s");
        System.out.println("replaced 1st charstring is: "+result3);
        String result4=string.replaceAll(string,"i am sarita");
        System.out.println("replaced all string is: "+result4);
    }
}
