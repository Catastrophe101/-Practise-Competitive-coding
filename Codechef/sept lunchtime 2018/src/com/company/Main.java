package com.company;
//question name:
import java.io.*;
import java.lang.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int t=Integer.parseInt(br.readLine());
            int count=0;
            for(int j=0;j<t;j++){
                String[] in=br.readLine().split(" ");
                if(Math.abs(Integer.parseInt(in[1])-Integer.parseInt(in[0]))>5){
                    count++;
                }
            }System.out.println(count);
        }
    }
}