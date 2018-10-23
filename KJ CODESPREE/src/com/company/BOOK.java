package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOOK {
    public static void main(String[] args)throws IOException {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            String[] in=br.readLine().split(" ");
            int n=Integer.parseInt(in[0]);
            int m=Integer.parseInt(in[1]);
            String[] page=br.readLine().split(" ");
            String[] li=br.readLine().split(" ");
            String[] ri=br.readLine().split(" ");
            int[] flag=new int[400];
            for(int j=0;j<m;j++){
                int s=Integer.parseInt(li[j])/10;
                int e=Integer.parseInt(ri[j])/10;
                for(int a=s;a<e;a++){
                    flag[a]++;
                }
            }
            int[] count=new int[n];
            int[]  cpage=new int[n];
                for (int k = 0; k < n; k++) {
                    if(flag[Integer.parseInt(page[k])/10]>0){
                        count[k]=count[k]+1;
                    }
            }
            for(int l=0;l<n;l++){
                System.out.println(count[l]+" "+cpage[l]);
            }
        }
    }
}
