package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LINCHESS {
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
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        while(t-->0){
            String[] in=sc.nextLine().split(" ");
            long n=Long.parseLong(in[0]);
            long k=Long.parseLong(in[1]);
            long out=0;
            long min=Integer.MAX_VALUE;
            String[] data=sc.nextLine().split(" ");
            for(int i=0;i<data.length;i++){
                if(k>Long.parseLong(data[i]) && k%Long.parseLong(data[i])==0){
                    long steps=(k/Long.parseLong(data[i]))-1;
                    if(steps<min){
                        min=steps;
                        out=Long.parseLong(data[i]);
                    }
                }
            }
            if(out<=0){
                out=-1;
            }
            System.out.println(out);
        }
    }
}
