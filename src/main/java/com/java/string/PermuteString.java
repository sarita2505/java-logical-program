package com.java.string;

public class PermuteString {
    public static void main(String[] args) {
        String s="abc";
        permutationsOfString(s,0,s.length());
    }
    public static void permutationsOfString(String s,int i,int j){

        if(i==j-1){
            System.out.println(s);
        }
        else{
            for (int k=i;k<j;k++){
            s=swap(s,i,k);
            permutationsOfString(s,i+1,j);
            s=swap(s,i,k);}

        }

    }
    public static String swap(String s,int i,int j){
        char[] chars=s.toCharArray();
        char temp;
        temp=chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
        return String.valueOf(chars);
    }
}
