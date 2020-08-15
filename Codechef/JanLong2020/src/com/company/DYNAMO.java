package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class DYNAMO {
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
            int n=sc.nextInt();
            BigInteger limit= new BigInteger(String.valueOf((long)Math.pow(10,n)));
            BigInteger a=new BigInteger(sc.next());
            BigInteger sum=new BigInteger(String.valueOf(a)).add(limit.multiply(BigInteger.valueOf(2)));
            System.out.println(sum);
            BigInteger b=new BigInteger(sc.next());
            BigInteger tmp=new BigInteger(String.valueOf(a)).add(b).add(limit);
            BigInteger c=new BigInteger(String.valueOf(sum)).subtract(tmp); //-(a+b+limit));
            System.out.println(c);
            BigInteger d=new BigInteger(sc.next());
            BigInteger tp=new BigInteger(String.valueOf(a)).add(b).add(c).add(d);
            BigInteger e=new BigInteger(String.valueOf(sum)).subtract(tp);
            System.out.println(e);
            if(sc.nextInt()==-1){
                break;
            }
        }
    }
}
