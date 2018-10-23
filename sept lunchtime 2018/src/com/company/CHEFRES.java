package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CHEFRES {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
        String[] in=br.readLine().split(" ");
        int n=Integer.parseInt(in[0]);
        int m=Integer.parseInt(in[1]);
        int[] data=new int[2*n];
        int min=2147483647;int max=0;
            for(int j=0;j<n;j++){
            String[] a=br.readLine().split(" ");
            data[2*j]=Integer.parseInt(a[0]);
            data[2*j+1]=Integer.parseInt(a[1]);
            if(data[2*j]<=min)
            {
                min=data[2*j];
            }
            if(data[2*j+1]>=max){
                max=data[2*j+1];
            }
        }
        Arrays.sort(data);
        for(int k=0;k<m;k++){
            int q=Integer.parseInt(br.readLine());
            for(int l=0;l<(2*n)-2;l+=2) {
                //System.out.println("l is " + l);
                if(q<=min){
                    System.out.println(min-q);
                    break;
                }else if(q>max){
                    System.out.println(-1);
                    break;
                }else
                if (data[l] <= q && q < data[l + 1]) {
                    System.out.println(0);
                    break;
                } else if (q >= data[l + 1] && q < data[l + 2] && l + 2 < 2 * n) {
                        System.out.println(data[l + 2]-q);
                        break;
                    }
                }
               // System.out.println("no case");
            }
            }
        }
    }
