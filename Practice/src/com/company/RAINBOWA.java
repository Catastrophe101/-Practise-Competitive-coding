package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RAINBOWA {
    public static void main (String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            String[] in=br.readLine().split(" ");
            int size=0;
            int flag=0;
            int count=1;
            if (n<=12){
                System.out.println("no");
                continue;
            }
            for(int j=0;j<n;j++) {
                if(Integer.parseInt(in[j])==count && flag==0){
                    size++;
                }
                else if(Integer.parseInt(in[j])==count+1 && flag==0){
                    count++;
                    size++;
                }
                else if(count==7){
                    flag=1;
                    count--;
                    size--;
                }else if(Integer.parseInt(in[j])==count && flag==1){
                    size--;
                }
                else if(Integer.parseInt(in[j])==count-1 && flag==1){
                    count--;
                    size--;
                }
                else{
                    size=10;
                    break;
                }
            }
            if(size==1 && count==1){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }

    }
}
