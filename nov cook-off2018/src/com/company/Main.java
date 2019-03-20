package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
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
        for(int i=0;i<t;i++) {
            int tr=sc.nextInt();
            String[] in1=sc.nextLine().split(" ");
            int dr=sc.nextInt();
            String[] in2=sc.nextLine().split(" ");
            int ts=sc.nextInt();
            String[] in3=sc.nextLine().split(" ");
            int ds=sc.nextInt();
            String[] in4=sc.nextLine().split(" ");
            HashMap<String, Integer> Tr = new HashMap<>();
            HashMap<String, Integer> Dr = new HashMap<>();
            for(int j=0;j<tr;j++){
                Tr.put(in1[j],1);
            }
            for(int j=0;j<dr;j++){
                Dr.put(in2[j],1);
            }
            int flag=0;
            for(int k=0;k<ts;k++){
                if(!Tr.containsKey(in3[k])){
                    flag=1;
                    break;
                }
            }
            if(flag!=1){
                for(int k=0;k<ds;k++){
                    if(!Dr.containsKey(in4[k])){
                        flag=1;
                        break;
                    }
                }
            }
            if(flag==1){
                System.out.println("no");
            }
            else System.out.println("yes");
            flag=0;
        }
    }
}
