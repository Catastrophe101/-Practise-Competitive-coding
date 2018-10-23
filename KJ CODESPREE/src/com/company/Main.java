package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            int a = Integer.parseInt(in[0]) * Integer.parseInt(in[2]);
            int b = Integer.parseInt(in[1]) * Integer.parseInt(in[3]);
            if (a % Integer.parseInt(in[1])== 0 && b % Integer.parseInt(in[0])== 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

