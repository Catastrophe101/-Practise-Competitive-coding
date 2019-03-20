package com.company;

public class QUEUE {
    static class Queue{
       Node head=null;
       void add(int x){
           Node node=new Node(x);
           if(head==null){
               head=node;
           }
           else{
               Node t=head;
               while(t.next!=null){
                   t=t.next;
               }
               if(t!=null)
               t.next=node;
           }
       }
       int delete(){
           if(head==null){
               return -1;
           }
           if(head.next==null){
               int ret=head.data;
               head=null;
               return ret;
           }
           else{
               Node t=head;
               while(t.next.next!=null){
                   t=t.next;
               }
               int ret=t.next.data;
               t.next=null;
               return ret;
           }
       }
    }
    static class Node{
        int data;
        Node next=null;
        Node(int item){
            this.data=item;
            this.next=null;
        }
    }



    public static void main(String[] args){
        Queue q[]=new Queue[2];
        q[0]=new Queue();
        q[1]=new Queue();
        q[0].add(1);
        q[0].add(2);
        q[0].add(3);
        q[0].add(4);
        int ret=0;
        while(ret!=-1) {
            ret = q[0].delete();
            System.out.println(ret);
        }
    }
}
