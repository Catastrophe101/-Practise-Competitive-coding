package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CKWLK {
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
    public static int multiple(long in){
        int data1=0,data2=0;
        if(in<1){
            return 0;
        }
        if(in==1)
            return 1;
        if(in%10==0)
        data1=multiple(in/10);
        if(in%20==0)
        data2=multiple(in/20);

        if(data1==1 || data2==1)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Main.FastReader sc=new Main.FastReader();
        int t=sc.nextInt();
        while(t-->0){
                long data=sc.nextLong();
                data=multiple(data);
                if(data==1){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
