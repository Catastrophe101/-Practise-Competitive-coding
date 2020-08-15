package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PLMU {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] data = sc.nextLine().split(" ");
            int zeroCount = 0, twoCount = 0;
            for (int i = 0; i < n; i++) {
                if (Integer.parseInt(data[i]) == (long) 0) {
                    zeroCount++;
                } else if (Integer.parseInt(data[i]) == (long) 2) {
                    twoCount++;
                }
            }
            try {
                int pairs = 0;
                if (zeroCount == 2) {
                    pairs = pairs + 1;
                }
                if (twoCount == 2) {
                    pairs = pairs + 1;
                }
                if (zeroCount > 2) {
                    pairs = pairs + (fact(zeroCount)) / (fact(zeroCount - 2) * 2);
                }
                if (twoCount > 2) {
                    pairs = pairs + (fact(twoCount)) / (fact(twoCount - 2) * 2);
                }
                System.out.println(pairs);
            } catch (Exception e) {
                return;
            }
        }
    }
    static int fact(int n)
    {
        if (n == 0)
            return 1;

        return n*fact(n-1);
    }
}