package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW005 {
    public static void main(String args[])throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int count;
        for(int i=0;i<n;i++) {
            String[] in = br.readLine().split(" ");
            int a = Integer.parseInt(in[0]);
            count=0;
            while (a > 0) {
                if (a >=100) {
                    a=a-100;
                    count++;
                    continue;
                } else if(a>=50){
                    a=a-50;
                    count++;
                    continue;
                } else if(a>=10){
                    a=a-10;
                    count++;
                    continue;
                } else if(a>=5){
                    a=a-5;
                    count++;
                    continue;
                } else if(a>=2){
                    a=a-2;
                    count++;
                    continue;
                } else if(a>=1){
                    a=a-1;
                    count++;
                    continue;
                }
            }
            System.out.println(count);
        }
    }
}
