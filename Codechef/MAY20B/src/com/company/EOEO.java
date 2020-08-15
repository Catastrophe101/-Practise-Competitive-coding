package com.company;

import com.sun.org.apache.bcel.internal.generic.FASTORE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EOEO {
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
            long in = sc.nextLong();
            long out = 0;
            if (in % 2 == 0) {
                long ts = in;
                int mul = 1;
                while (ts > 0) {
                    ts = ts / 2;
                    if (ts % 2 == 1 || ts == 0) {
                        break;
                    }
                    mul++;
                }
                long js= (long) Math.pow(2,mul+1);
                out=in/js;
            } else {
                out = in / 2;
            }
            System.out.println(out);
        }
    }
}
