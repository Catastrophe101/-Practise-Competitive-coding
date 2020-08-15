package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String[] in=br.readLine().split(" ");
            int sum=Integer.parseInt(in[0])+Integer.parseInt(in[1]);
            if(sum<Integer.parseInt(in[2])){
                System.out.println("CHEF");
                continue;
            }
            int dsum=sum/Integer.parseInt(in[2]);
            //System.out.println();
            if(dsum%2==0)
            {
                System.out.println("CHEF");
            }
            else {
                System.out.println("COOK");
            }
        }
    }
}