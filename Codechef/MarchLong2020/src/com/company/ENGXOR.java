package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ENGXOR{
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
            int n =Integer.parseInt(data[0]);
            int q=Integer.parseInt(data[1]);
            String[] A=sc.nextLine().split(" ");
            long[] a=new long[n];
            int odd=0,even=0;
            for (int i = 0; i <n ; i++) {
                a[i]=Long.parseLong(A[i]);
                if(isOddOnes(a[i]^1)){
                    odd++;
                }else{
                    even++;
                }
            }
            StringBuilder sb=new StringBuilder();
            long starttime = System.currentTimeMillis();
            for (int j = 0; j <q ; j++) {
                int p=sc.nextInt();
                if(isOddOnes(p)){
                    sb.append(even+" "+odd);
                }
                else {
                    sb.append(odd+" "+even);
                }
                sb.append("\n");
            }
            long printlntime = System.currentTimeMillis();
            System.out.println(printlntime-starttime);
        }
        }
    public static boolean isOddOnes(long input){
        int oneCount=0;
        oneCount=Long.bitCount(input);
        if(oneCount%2==1){
            return true;
        }
        else{
            return false;
        }
    }
}
