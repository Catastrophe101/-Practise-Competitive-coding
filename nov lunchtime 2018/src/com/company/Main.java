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
        HashMap days=new HashMap<String,Integer>();// {{}, "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        days.put("sunday",1);
        days.put("monday",2);
        days.put("tuesday",3);
        days.put("wednesday",4);
        days.put("thursday",5);
        days.put("friday",6);
        days.put("saturday",7);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String[] in=sc.nextLine().split(" ");
            int start=(int)days.get(in[0]);
            int end=(int)days.get(in[1]);
            int dif=0;
            if(end>start){
                dif=end-start+1;
            }
            else if(start>end){
                dif=end+7-start+1;
            }
            else if(start==end){
                dif=1;
            }
           // System.out.println("dif = "+dif);
            int l=Integer.parseInt(in[2]);
            int r=Integer.parseInt(in[3]);
            int count=0,num=0;
                for (int j =l; j <= r; j++) {
                    if(dif==7){
                        if (j % 7 == 0) {
                            num = j;
                            count++;
                        }
                    }
                    else if(dif==1) {
                        if (j % 7 == dif) {
                            num = j;
                            count++;
                        }
                    } else {
                        if (j % 7 == dif) {
                            num = j;
                            count++;
                        }
                    }
                }
                if(dif==1 && count==0)
                if(l<=1 && r>=1){
                    count=1;
                    num=1;
                }
            //System.out.println("count = "+count);
            if(count==0) {
                System.out.println("impossible");
                }
            else if(count==1){
                 System.out.println(num);
             }
             else if (count>1)
                 System.out.println("many");
/*
            if(dif>=l && dif<=r){
                if(r<dif+7){
                    System.out.println(dif);
                }
                else System.out.println("many");
            }
            else System.out.println("impossible");*/
        }
    }
}
