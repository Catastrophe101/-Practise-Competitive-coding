package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHEFADD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int count = 0, ca = 0, cb = 0;
            String[] in = br.readLine().split(" ");
            int a = Integer.parseInt(in[1]), b = Integer.parseInt(in[0]), c = Integer.parseInt(in[2]);
            ca = getbitcount(a);
            cb = getbitcount(b);
                for (int j = 1; j <=c; j++) {
                    if (ca == getbitcount(j) && cb == getbitcount(c - j)) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    public static int getbitcount(int in) {
        int count = 0;
        while (in > 0) {
            if (in % 2 == 1)
                count++;
            in = in / 2;
        }
        return count;
    }
}
