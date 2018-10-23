package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW007 {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String out="";
        for(int i=0;i<n;i++) {
           int in=Integer.parseInt(br.readLine());
           while(in>0){
               if(in%10==0){
                   in=in/10;
               }
               else{
                   while(in>0){
                       System.out.print(in%10);
                       in=in/10;
                   }
                   System.out.println();
               }
           }
        }
    }
}
