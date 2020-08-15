package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PRDRG {
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
        String[] in=sc.nextLine().split(" ");
        int n=Integer.parseInt(in[0]);
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            int a=Integer.parseInt(in[i]);
            if(a<3){
                if(a==1){
                    sb.append("1 2");
                }
                else if(a==2)
                {
                    sb.append("1 4");
                }
            }else {
                int x=3;
                for(int j=3;j<a;j++){
                    if(j%2==0){
                        x=(x*2)+1;
                    }
                    else x=(x*2)-1;
                }
                long y=(long)Math.pow(2,a);
                sb.append(x+" "+y);
            }
            if (i==n){
                //sb.append(" ");
            }else
                sb.append(" ");
        }
        System.out.println(sb.toString());
    }

}
