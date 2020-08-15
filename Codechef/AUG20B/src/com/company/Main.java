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
            String[] data=sc.nextLine().split(" ");
            int p=Integer.parseInt(data[0]);
            int c=Integer.parseInt(data[1]);
            while(p>0 && c>0){
                p=p-c;
                c=c/2;
            }
            if(p>c){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
        }
    }
}
