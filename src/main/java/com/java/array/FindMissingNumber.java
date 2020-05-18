package com.java.array;

public class FindMissingNumber {
    public static void main(String[] args) {
       // findMissingByXor(new Integer[]{1,2,3,5,6,7});
        findMissingByXor(new Integer[]{2,3,4,5,6,7});
       // byNormalApp(new Integer[]{2,3,4,5,6,7},7);
    }
    public static  void findMissingByXor(Integer a[]){
        int xor1=a[0];
        int xor2=a[0];
        for (int i=0;i<a.length-1;i++){
            xor1=xor1^a[i];
        }
        for (int i=0;i<a.length+1;i++){
            xor2=xor2^i;
        }
        System.out.println(xor1^xor2);
    }
    public static void byNormalApp(Integer[] a,int n){
        int sum1=(n*(n+1))/2;
        int sum2=a[0];
        for (int i=1;i<a.length;i++){
            sum2=sum2+a[i];
        }
        System.out.println(sum1);
        System.out.println(sum2);
      int  result=sum1-sum2;
        System.out.println("missing number is: "+result);
    }
}
