package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CUTBOARD {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String[] in=br.readLine().split(" ");
            int a=Integer.parseInt(in[0]);
            int b=Integer.parseInt(in[1]);
            System.out.println((a-1)*(b-1));
        }
    }
}
