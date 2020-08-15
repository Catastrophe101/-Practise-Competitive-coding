package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DPAIRS {
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
        String[] in = sc.nextLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        String[] a = sc.nextLine().split(" ");
        String[] b = sc.nextLine().split(" ");
        long max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        long minpos=0,maxpos=0;
        long[] la=new long[n];
        long[] lb=new long[m];
        for(long i=0;i<n;i++){
            la[(int)i]=Long.parseLong(a[(int)i]);
            if(min>la[(int)i]){
                min=la[(int)i];
                minpos=i;
            }
        }
        for(long i=0;i<m;i++){
            lb[(int)i]=Long.parseLong(b[(int)i]);
            if(max<lb[(int)i]){
                max=lb[(int)i];
                maxpos=i;
            }

        }
        long i=minpos;
            for (int j = 0; j < m; j++) {
                    System.out.println(i+" "+j);
                }
        long j=maxpos;
        for (i=0; i < n; i++) {
            if (i==minpos)
                continue;
            else
            {
                System.out.println(i+" "+j);
            }
        }
    }
}
