package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YOMONKEY {
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
    public static void main(String[] args){
    FastReader sc =new FastReader();
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        String[] in=sc.nextLine().split(" ");
        int[] p=new int[n];
        int[] temp=new int[n];
        for(int h=0;h<n;h++) {
            p[h] = Integer.parseInt(in[h]);
        }
        int count =0;
            do {
            for(int g=0;g<n;g++){
                temp[p[g]-1]=p[g];
                System.out.print(temp[p[g]-1]);
            }

            count++;
            }while(search(p,temp)==1);
            System.out.println(count);
        }
    }
    public static int search(int[] a,int[] b){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return 0;
            }
        }
        return 1;
    }
}
