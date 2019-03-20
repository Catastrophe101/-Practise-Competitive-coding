package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ARRGRAPH {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] pset={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47};
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n=Integer.parseInt(br.readLine());
            int[] data=new int[n];
            int count=0;
            int[] flag=new int[n];
            String[] in=br.readLine().split(" ");
            for(int l=0;l<n;l++)
                data[l]=Integer.parseInt(in[l]);
            for(int j=0;j<n;j++){
                for(int k=j;k<n;k++) {
                    if(flag[j]==0 && j!=k) {
                        if(coprime(data[j] , data[k]) == 1) {
                            flag[k]=1;
                            flag[j]=1;
                        }
                        else{
                            count++;
                        }
                    }
                }
            }
        System.out.println(count);
        }
    }
    public static int coprime(int a,int b){
        int x=0,y=0,z=0;
        if (a>b){
            x=a;
            y=b;
        }
        else{
            x=b;
            y=a;
        }
        z=x%y;
        while(x%y!=0){
            z=x%y;
            x=y;
            y=z;
        }
        if(y==1){
            return 1;
        }
        else return 0;
    }

}
