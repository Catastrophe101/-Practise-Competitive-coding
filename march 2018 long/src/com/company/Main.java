package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        //System.out.println(n);
        String[] type = new String[n];
        String[] coins=new String[n];
        int min1=99999;
        int min2=99999;
        int min3=99999;
            coins = br.readLine().split(" ");
            type = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            //System.out.println(type[i]);
            if(Integer.parseInt(type[i])==1){
               // System.out.println(Integer.parseInt(coins[i]));
                if(Integer.parseInt(coins[i])<min1)
                    min1=Integer.parseInt(coins[i]);
            }
            else if(Integer.parseInt(type[i])==2){
                if(Integer.parseInt(coins[i])<min2)
                    min2=Integer.parseInt(coins[i]);
            }
            else if(Integer.parseInt(type[i])==3){
                if(Integer.parseInt(coins[i])<min3)
                    min3=Integer.parseInt(coins[i]);
            }
        }
        //System.out.println(min1);
        //System.out.println(min2);
        //System.out.println(min3);
        if(min1+min2<=min3){
            System.out.println(min1+min2);
        }
        else {
            System.out.println(min3);
        }
    }
}
