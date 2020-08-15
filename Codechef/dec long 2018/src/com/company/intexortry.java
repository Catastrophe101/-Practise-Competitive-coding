package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class intexortry {
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
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            for(int j=1;j<=n;j++) {
                if (j % 3 != 0) {
                    System.out.println("1 " + j + " " + j + " " + j);
                    a[j] = sc.nextInt();
                }
                else{
                    System.out.println("1 "+j +" "+(j-1)+" "+(j-2));
                    a[j]=sc.nextInt()^a[j-1]^a[j-2];
                }
            }
            System.out.print("2");
            for (int j = 1; j < n+1; j++) {
                System.out.print(" " +a[j]);
            }
            System.out.println();
        }
        int ans=sc.nextInt();
        if(ans==-1){
            return;
        }
        }
    }
