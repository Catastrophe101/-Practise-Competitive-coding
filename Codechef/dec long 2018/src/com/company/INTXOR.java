package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class INTXOR {
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
            int[] a=new int[n];
            int start=0,next=0;
            System.out.println("1 "+1+" "+2+" "+3);
            int ret=sc.nextInt();
            System.out.println("1 "+4+" "+5+" "+6);
            int xet=sc.nextInt();
            if(ret%2==0){
                start=ret+1;
            }
            else{
                start=ret-3;
            }
            if(xet%2==0){
                next=xet+1;
            }
            else{
                next=xet-3;
            }
            if(next==start+3) {
                System.out.print("2");
                for (int j = 0; j < n; j++) {
                    System.out.print(" " +start++);
                }
                System.out.println();
            }
            else {
                for (int k = 1; k <=n; k++) {
                    if (k != 3 && k != 6) {
                        System.out.println("1 " + k + " " + k + " " + k);
                        a[k - 1] = sc.nextInt();
                    } else if (k == 3) {
                        a[2] = ret ^ a[0] ^ a[1];
                    } else if (k == 6) {
                        a[5] = xet ^ a[3] ^ a[4];
                    }
                }
                System.out.print("2");
                for (int j = 0; j < n; j++) {
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
}
