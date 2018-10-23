package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OETW {
    public static  void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            int[] temp=new int[2*n+1];
            String[] in=br.readLine().split(" ");
            int count=0;
            for(int j=0;j<n;j++){
                int sum=0;
                for(int k=j;k<n;k++){
                    sum=sum+Integer.parseInt(in[k]);
                    if (0<sum && sum<(2*n+1) && temp[sum]!=1){
                        temp[sum]=1;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
