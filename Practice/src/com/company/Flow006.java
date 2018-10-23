package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flow006 {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int sum;
        for(int i=0;i<n;i++) {
            int a = Integer.parseInt(br.readLine());
            sum=0;
            while (a > 0) {
                sum=sum + a%10;
                a=a/10;
            }
            System.out.println(sum);
        }
    }
}
