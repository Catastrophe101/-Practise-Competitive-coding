package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class one {
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

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i=0 ;i<n;i++){
            if(!hm.containsKey(ar[i])){
                hm.put(ar[i],1);
            }else{
                int temp=hm.get(ar[i]);
                hm.put(ar[i],temp++);
            }
        }
        int count=0;
        for(Map.Entry<Integer,Integer> m:hm.entrySet()){
            int t=m.getValue();
            if(m.getValue() > 2){
                count++;
            }
        }
        return count;
    }




    public static void main(String[] args) {
        // write your code here
        FastReader sc=new FastReader();
        String[] in=sc.nextLine().split(" ");
        long n=Long.parseLong(in[0]);
        long q=Long.parseLong(in[1]);
        long[] f=new long[(int)n];
        long[] og=new long[(int)n];
        String[] data=sc.nextLine().split(" ");
        for(int i=0;i<n;i++){
            f[i]=Long.parseLong(data[i]);
            og[i]=Long.parseLong(data[i]);
        }
        for(int j=0;j<q;j++){
            long qu=sc.nextLong();
            for(int i=0;i<n;i++){
                f[i]=og[i];
            }
            long out=f[0];
            if(qu<n) {
                for(int k=1;k<qu;k++)
                    out=out^f[k];
                System.out.println(out);
            }else{
                for(int k=1;k<qu;k++) {
                    if (k < n) {
                        out=out^f[k];
                    } else {
                        long last=f[0];
                        for(int l=1;l<n;l++){
                                last=last^f[l];
                            }
                        for(int l=1;l<n-1;l++){
                            f[l]=f[l+1];
                        }
                        f[(int)(n-1)]=last;
                        out=out^f[(int)(n-1)];
                    }
                }
                System.out.println(out);
            }
        }
    }
}