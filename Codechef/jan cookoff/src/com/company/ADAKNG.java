package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ADAKNG {
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
        for (int i = 0; i < t; i++) {
            String[] in = sc.nextLine().split(" ");
            int r = Integer.parseInt(in[0]);
            int c = Integer.parseInt(in[1]);
            int k = Integer.parseInt(in[2]);
            int rstart, rend, cstart, cend;
            rstart = r + k;
            rend = r - k;
            cstart = c + k;
            cend = c - k;
            if (rstart > 8) {
                rstart=8;
            }
            if(rend<1){
                rend=1;
            }
            if (cstart > 8) {
                cstart=8;
            }
            if(cend<1){
                cend=1;
            }
            int count=(Math.abs(rstart-rend)+1)*(Math.abs(cstart-cend)+1);
            System.out.println(count);
        }
    }
}
