package com.java.linkedlist.dispmiddle;

public class Disp {
    public static void main(String[] args) {
        Node n1=new Node(10,null);
        Node n2=new Node(20,null);
        Node n3=new Node(30,null);
        Node n4=new Node(40,null);
        Node n5=new Node(50,null);
        Node n6=new Node(50,null);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        Node temp=n1;
       // System.out.println(n1);
        while (n1!=null && n1.next!=null){
           // System.out.println(n1.data);
            temp=temp.next;
           // System.out.println("temp is :"+temp);
            n1=n1.next.next;

        }
        System.out.println("middle element is :"+temp.data);

       // display(n1);

    }
    public static void display(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}
