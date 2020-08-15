package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TRY {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int x = n-1,k=n/2;
            String[] in = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                System.out.println(j + "," + (j) + " " + (j) + "," + (x)+" " + (x) +"," + (x-j) + " "+ (j) + "," + (x-j));
                x--;
            }
        }
    }
}
