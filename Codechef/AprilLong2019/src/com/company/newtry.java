package com.company;

public class newtry 
{
    public static void main(String[] args) {
        String str="xyz";
        int key=2;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            int temp=(int)str.charAt(i);
            temp=temp-'a';
            System.out.println("temp = " + (temp+key));
            temp=((temp+key)%26)+'a';
            System.out.println("temp = " + (char)temp);
        }
    }
}
