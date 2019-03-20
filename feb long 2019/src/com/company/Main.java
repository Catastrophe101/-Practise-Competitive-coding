package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
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
        // write your code here
        FastReader sc = new FastReader();
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            String[] in = sc.nextLine().split(" ");
            BigInteger A = new BigInteger(in[1]);
            BigInteger B = new BigInteger(in[2]);
            BigInteger K = new BigInteger(in[3]);
            BigInteger N = new BigInteger(in[0]);
            BigInteger countA=N.divide(A);
            BigInteger countB=N.divide(B);
            BigInteger count=countA.add(countB);
            //System.out.println("countA = " + countA);
            //System.out.println("countB = " + countB);
            BigInteger countBoth=(N.divide(A.multiply(B)));
            count=count.subtract(countBoth.multiply(BigInteger.valueOf(2)));
            //System.out.println("count = " + count);
            if (count.compareTo(K)>=0) {
                System.out.println("Win");
            } else {
                System.out.println("Lose");
            }
        }
    }
}
