package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHEFADV {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt( br.readLine());
        for(int i=0;i<t;i++){
            String[] in=br.readLine().split(" ");
            int n=Integer.parseInt(in[0]);
            int m=Integer.parseInt(in[1]);
            int X=Integer.parseInt(in[2]);
            int Y=Integer.parseInt(in[3]);
            n=n-1;
            m=m-1;
            if(n==0){
                if(m%Y==0)
                    System.out.println("Chefirnemo");
                else System.out.println("Pofik");
            }
            else if(m==0){
                if(n%X==0)
                    System.out.println("Chefirnemo");
                else System.out.println("Pofik");
            }else if(n==0 && m==0)
                System.out.println("Chefirnemo");
           else if(n==1 && m==1)
               System.out.println("Chefirnemo");
           else if(n%X==0 && m%Y==0)
               System.out.println("Chefirnemo");
            else if(n%X==1 && m%Y==1){
                System.out.println("Chefirnemo");
            }
            else{
                System.out.println("Pofik");
            }
        }
    }
}
