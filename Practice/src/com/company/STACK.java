package com.company;

public class STACK {
    int length=0;
    static class Node{
        int data;
        Node next=null;
        Node(int item){
            this.data=item;
            this.next=null;
        }
    }

    static class stackex{
        Node root=null;
        void push(int x){
            Node node=new Node(x);
            if(root==null){
                root=node;
            }
            else{
                node.next=root;
                root=node;
            }
        }
        int pop(){
            if(root==null){
                return -1;
            }
            int ret=root.data;
            root=root.next;
            return ret;
        }
    }
    public static void main(String[] args) {
        stackex s = new stackex();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        int ret=0;
        while (ret != -1) {
            ret = s.pop();
            System.out.println(ret);
        }
    }
}
