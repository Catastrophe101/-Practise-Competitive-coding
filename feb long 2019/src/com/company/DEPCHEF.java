package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DEPCHEF {
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
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            String[] inA=sc.nextLine().split(" ");
            String[] inB=sc.nextLine().split(" ");
            int[] dataA=new int[n];
            int[] dataB=new int[n];
            for(int j=0;j<n;j++){
                dataA[j]=Integer.parseInt(inA[j]);
                dataB[j]=Integer.parseInt(inB[j]);
            }
            int out=-1;
            for(int j=0;j<n;j++){
                int posA=(n+j-1)%n,posB=(n+j+1)%n;
                int attackSum=dataA[posA]+dataA[posB];
                if(attackSum<dataB[j]){
                    int newout=dataB[j];
                    if(newout>out){
                        out=newout;
                    }
                }
            }
           /* TreeMap<Character,Integer> hm=new TreeMap<Character, Integer>();
            hm.put('a',1);
            hm.put('b',1);
            hm.put('c',1);
            //hm.put(4,1);

            hm.firstKey();
            */
            System.out.println(out);
        }
    }
}
