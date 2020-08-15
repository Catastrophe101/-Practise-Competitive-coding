package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CHFICRM {
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
            int[] cash=new int[3];
            int n=sc.nextInt();
            int flag=0;
            String[] data=sc.nextLine().split(" ");
            for(int i=0;i<n;i++){
                int in=Integer.parseInt(data[i]);
                if(in==5){
                    cash[0]++;
                }else
                if(in==10){
                    if(cash[0]>=1){
                        cash[0]--;
                        cash[1]++;
                    }else{
                        flag=1;
                        break;
                    }
                }else
                if(in==15){
                    if(cash[1]>=1){
                        cash[1]--;
                        cash[2]++;
                    }else if( cash[0]>=2){
                        cash[0]-=2;
                        cash[2]++;
                    }else{
                        flag=1;
                        break;
                    }
                }
            }
        if(flag==1){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
        }
    }
}
