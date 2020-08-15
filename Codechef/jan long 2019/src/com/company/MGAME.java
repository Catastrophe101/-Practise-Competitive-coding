package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MGAME {
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
      FastReader sc=new FastReader();
      int t=sc.nextInt();
      for(int i=0;i<t;i++){
          String[] in=sc.nextLine().split(" ");
          int n=Integer.parseInt(in[0]);
          int p=Integer.parseInt(in[1]);
          int max=0,max1=0;
          int count=0;
          int lim;
         if(n<p){
              lim=n+1;
          }
          else {
              lim=p+1;
          }
          for(int j=1;j<lim;j++){
              if(max1<n%j){
                  max1=n%j;
              }
          }
          //System.out.println("max1 is "+max1);
          for(int j=1;j<p+1;j++){
              for(int k=1;k<p+1;k++){
                  for(int l=1;l<p+1;l++){
                      if((((n%j)%k)%l)%n==max1){
                          count++;
                          //System.out.println("i= "+j+" j= "+k+" k="+l);
                      }
                      /*if((((n%j)%k)%l)%n>max){
                          max=(((n%j)%k)%l)%n;
                          //System.out.println("i= "+j+" j= "+k+" k="+l);
                          count=1;
                      }*/
                  }
              }
          }
          //System.out.println("max is "+max);
          System.out.println(count);
      }
    }
}
