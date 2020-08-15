package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EOEO_brute {
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
            long in=sc.nextLong();
            long out=0;
            if(in%2==0) {
                for(long i=2;i<=in-2;i+=2){
                    long js=i;
                    long ts=in;
                    while(ts>=1 && js>=1){
                        if(ts%2==0 && js%2==0){
                            ts=ts/2;
                            js=js/2;
                        }else if(ts%2==1 && js%2==1){
                            break;
                        }else if(ts%2==0 && js%2==1){
                            break;
                        }else if(ts%2==1 && js%2==0){
                            System.out.println("js = " +i);
                            out++;
                            break;
                        }else{
                            break;
                        }
                    }
                }
            }else {
                out=in/2;
            }
            System.out.println(out);
        }
    }
}
