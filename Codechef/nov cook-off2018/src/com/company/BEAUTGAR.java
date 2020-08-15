package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEAUTGAR {
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
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            char[] in=sc.nextLine().toCharArray();
            long rsize=0,gsize=0;
            for(int j=0;j<in.length;j++){
                if(in[j]=='R'){
                    rsize++;
                }
                else if(in[j]=='G'){
                    gsize++;
                }
            }
            if(rsize==gsize){
                System.out.println("yes");
            }
            else System.out.println("no");
        }
    }
}
