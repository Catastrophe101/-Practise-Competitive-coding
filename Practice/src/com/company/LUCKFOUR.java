package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LUCKFOUR {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            int in=Integer.parseInt(br.readLine());
            int count=0;
            while(in>0){
                if(in%10==4)
                    count++;
                in=in/10;
                }
                System.out.println(count);
            }
        }
    }
