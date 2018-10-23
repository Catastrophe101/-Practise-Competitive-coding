package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < t; i++) {
                int n = Integer.parseInt(br.readLine());
                String[] in = br.readLine().split(" ");
                int count = 0;
                int[] flag = new int[n+1];
                for (int j = 0; j < n; j++) {
                    if (Integer.parseInt(in[j]) > 0 && Integer.parseInt(in[j]) < n + 1 && flag[Integer.parseInt(in[j])] == 0) {
                        flag[Integer.parseInt(in[j])] = 1;
                    } else count++;
                }
                System.out.println(count);
            }

    }

}