package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHEFSOCK {
    public static void main(String args[])throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] in=br.readLine().split(" ");
        int a=Integer.parseInt(in[0]);
        int b=Integer.parseInt(in[1]);
        int c=Integer.parseInt(in[2]);

        if(((c-a)/b%2)==0){
            System.out.println("Lucky Chef");
        }
        else{
            System.out.println("Unlucky Chef");
        }
    }
}
