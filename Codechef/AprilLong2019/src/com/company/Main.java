package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

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
        FastReader sc = new FastReader();
        long n = sc.nextInt();
        long max = 0;
        long secondMax = 0;
        String[] data = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(data[i]) > max) {
                max = Integer.parseInt(data[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if(Integer.parseInt(data[i]) > secondMax && Integer.parseInt(data[i]) <max ){
                secondMax = Integer.parseInt(data[i]);
            }
        }
        System.out.println(secondMax);
        int[] a=new int[100];
        TreeMap<Integer,Integer> tr=new TreeMap<Integer, Integer>();
        Map.Entry<Integer,Integer> etr=tr.lastEntry();
        StringBuilder sb=new StringBuilder();

        sb.insert(100,"bitch");

    }
}
