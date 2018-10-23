package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLOW018 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int in = Integer.parseInt(br.readLine());
            System.out.println(fact(in));
        }
    }
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
}
