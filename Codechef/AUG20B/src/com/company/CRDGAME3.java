package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CRDGAME3 {
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
            String[] data=sc.nextLine().split(" ");
            int chef=Integer.parseInt(data[0]);
            int rick=Integer.parseInt(data[1]);
            int chefCount=0,rickCount=0;
            chefCount=(chef%9==0)?(chef/9):(chef/9)+1;
            rickCount=(rick%9==0)?(rick/9):(rick/9)+1;
            int winner=1,out=rickCount;
            if(chefCount<rickCount){
             winner=0;
             out=chefCount;
            }
            System.out.println(winner+" "+out);
        }
    }
}
