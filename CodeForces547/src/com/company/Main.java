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
        long n=sc.nextLong();
        long m=sc.nextLong();
        long turns=0;
        if(m%n==0){
            long temp=m/n;
            int flag=0;
            while(temp>0){
                if(temp%3==0){
                    turns++;
                    temp=temp/3;
                }
                else if(temp%2==0){
                    turns++;
                    temp=temp/2;
                }else{
                    float a=temp/3;
                    float b=temp/2;
                    if(a!=0 || b!=0) {
                        flag = 1;
                        System.out.println("-1");
                    }
                    break;
                }
            }
            if(flag!=1)
            System.out.println(turns);
        }
        else{
            System.out.println("-1");
        }
    }
}
