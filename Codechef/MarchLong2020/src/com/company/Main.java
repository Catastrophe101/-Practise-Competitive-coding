package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
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
            int n=Integer.parseInt(data[0]);
            HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
            String[] f=sc.nextLine().split(" ");
            String[] p=sc.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                if(!hm.containsKey(Integer.parseInt(f[i]))){
                    hm.put(Integer.parseInt(f[i]),Integer.parseInt(p[i]));
                }else {
                    int temp=hm.get(Integer.parseInt(f[i]))+Integer.parseInt(p[i]);
                    hm.put(Integer.parseInt(f[i]),temp);
                }
            }
            int minValue=Integer.MAX_VALUE;
            for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
                if(minValue>=entry.getValue()){
                    minValue=entry.getValue();
                }
            }
            System.out.println(minValue);
        }
    }
}
