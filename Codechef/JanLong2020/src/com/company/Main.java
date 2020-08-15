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
        while(t-->0){
            int out=0;
            String[] data=sc.nextLine().split(" ");
            int ost=Integer.parseInt(data[0]);
            int st=ost;
            for(int i=1;i<data.length;i++) {
                if(st>=Integer.parseInt(data[i])){
                    st=st-Integer.parseInt(data[i]);
                    if(i==data.length-1){
                        out++;
                    }
                }else{
                    out++;
                    st=ost;
                    i--;
                }
            }
            System.out.println(out);
        }
    }
}
