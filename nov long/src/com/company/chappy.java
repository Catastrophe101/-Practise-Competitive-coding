package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class chappy {
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
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            int n = sc.nextInt();
            String[] in = sc.nextLine().split(" ");
            int[] a = new int[n+1];
            if (n < 3) {
                System.out.println("Poor Chef");
                continue;
            }
            for (int j = 1; j < n+1; j++) {
                a[j] = Integer.parseInt(in[j-1]);
            }
            int flag=0;
            for(int j=1;j<n+1;j++){
                for(int k=1;k<n+1;k++){
                    if(a[j]<a.length && a[k]<a.length && a[j]!=a[k] && a[a[j]]==a[a[k]] ){
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==1){
                System.out.println("Truly Happy");
            }
            else {
                System.out.println("Poor Chef");
            }
        }
    }
}
