package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRIME {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] flag = new boolean[100];
        for (int p = 0; p < 100; p++)
            flag[p] = false;
        flag[0] = true;
        flag[1] = true;
        int h = 0;
        for (int j = 0; j < 100; j++) {
            for (int k = h+1; k < 100; k++) {
                if (flag[k] == false) {
                    h = k;
                    System.out.println("break at "+h);
                    break;
                }
            }
            for (int i = h * 2; i < 100; i += h) {
                if (h != 0) {
                    flag[i] = true;
                }
            }
        }
            for (int l = 0; l < 100; l++) {
                if (flag[l] == false)
                    System.out.println(l);
            }
        }
    }