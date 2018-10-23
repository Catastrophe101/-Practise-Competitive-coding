package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM2 {
    public static  void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            String[] in=br.readLine().split(" ");
            int n=Integer.parseInt(in[0]);
            int x=Integer.parseInt(in[1]);
            StringBuilder sb=new StringBuilder();
            String[] data=br.readLine().split(" ");
            for(int j=0;j<n;j++){
                if(x>=Integer.parseInt(data[j])){
                    x=x-Integer.parseInt(data[j]);
                    sb.append(1);
                }
                else sb.append(0);
            }
            System.out.println(sb.toString());
        }
    }
}
