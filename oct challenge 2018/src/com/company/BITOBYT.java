package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BITOBYT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int in=Integer.parseInt(br.readLine());
            if(in>0)
                in=in-1;
            long  countb=0,countn=0,countby=0;
            if(in <26){
                if(in <2){
                    countb=1;
                }
                else if(in <10){
                    countn=1;
                }
                else if(in <26){
                    countby=1;
                }
            }
            else {
                int pow=in/26;
                int temp=in%26;
                if(temp <2){
                    countb= (long) Math.pow(2,pow);
                }
                else if(temp <10){
                    countn= (long) Math.pow(2,pow);
                }
                else if(temp <26){
                    countby= (long) Math.pow(2,pow);
                }
            }
            System.out.println((long)countb+" "+(long)countn+" "+(long)countby);
        }
    }
}