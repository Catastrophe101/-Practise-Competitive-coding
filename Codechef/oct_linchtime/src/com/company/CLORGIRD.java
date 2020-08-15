package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CLORGIRD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] in = br.readLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            char[][] data = new char[n][m];
            char[][] ndata = new char[n][m];
            for (int j = 0; j < n; j++) {
                data[j] = br.readLine().toCharArray();
                ndata[j]=data[j];
            }
            int flag = 0;
            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < m - 1; k++) {
                    if (data[j][k] == '.' && data[j + 1][k] == '.' && data[j][k + 1] == '.' && data[j + 1][k + 1] == '.') {
                        ndata[j][k] = 'c';
                        ndata[j + 1][k] = 'c';
                        ndata[j][k + 1] = 'c';
                        ndata[j + 1][k + 1] = 'c';
                    }
                }
            }
            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < m - 1; k++) {
                    if (ndata[j][k] == '.') {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 1)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}