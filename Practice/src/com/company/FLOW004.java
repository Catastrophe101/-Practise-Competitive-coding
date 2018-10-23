package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW004 {

    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            int in=Integer.parseInt(br.readLine());
            int first=in%10;
            //System.out.println("f="+first);
            int last=0;
            int sum;
            while(in>0){
                in=in/10;
                if(in<10){
                    last=in;
                    //System.out.println("l="+last);
                    break;
                }
                }
                sum=first+last;
            System.out.println(sum);
            }
        }
    }

