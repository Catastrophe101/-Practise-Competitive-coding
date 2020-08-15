package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        int testcase=1;
        while(t-->0){
            String[] counts=sc.nextLine().split(" ");
            int n=Integer.parseInt(counts[0]);
            int m=Integer.parseInt(counts[1]);
            String[] data=sc.nextLine().split(" ");
            int interm=-1;
            int out=0;
            for(int i=0;i<n-1;i++){
                if(Integer.parseInt(data[i])==m){
                    interm=m;
                }
                if(Integer.parseInt(data[i+1])==interm-1){
                    interm--;
                    if(interm==1){
                        out++;
                    }
                }else{
                    interm=-1;
                }
                }
            System.out.println("Case #"+(testcase++)+": "+out);
        }
    }
}
