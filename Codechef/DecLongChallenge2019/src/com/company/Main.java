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
            int n= sc.nextInt();
            HashMap<Integer,Integer> scores=new HashMap<Integer, Integer>();
            for(int i=0;i<n;i++){
                String[] data=sc.nextLine().split(" ");
                if(Integer.parseInt(data[0])<9){
                    if(scores.containsKey(Integer.parseInt(data[0]))){
                        if(scores.get(Integer.parseInt(data[0]))<Integer.parseInt(data[1]))
                        scores.put(Integer.parseInt(data[0]),Integer.parseInt(data[1]));
                    }
                    else{
                        scores.put(Integer.parseInt(data[0]),Integer.parseInt(data[1]));
                    }
                }
            }
            long totalScore=0;
            for(Map.Entry<Integer,Integer> e:scores.entrySet()){
                totalScore+=e.getValue();
            }
            System.out.println(totalScore);
        }
    }
}
