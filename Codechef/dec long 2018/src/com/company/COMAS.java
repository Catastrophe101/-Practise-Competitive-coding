package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Vector;

public class COMAS {
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
        Vector<Integer> skip = new Vector();
        Vector<Integer> maxs = new Vector();
        for (int i = 0; i < t; i++) {
            int max = 0;
            int[] query = {1, 2, 3, 4, 5};
            int n = sc.nextInt();
            int flag = 0;
            int start=1;
            while (flag == 0) {
                System.out.print("?");
                int iter=0;
                int f=start;
                while(iter!=5) {
                    if(skip.contains(f)==false) {
                        query[iter]=f;
                        System.out.print(" " + query[iter]);
                        iter++;
                        f++;
                    }
                    else {
                        f++;
                    }
                }
                System.out.println();
                String[] in = sc.nextLine().split(" ");
                int third = Integer.parseInt(in[0]);
                int forth = Integer.parseInt(in[1]);
                max = forth;
                if (!skip.contains(third))
                    skip.add(third);
                if (!maxs.contains(forth))
                    maxs.add(forth);
                if(f==n+1){
                    break;
                }
            }
            System.out.println(maxs);
            System.out.println(skip);
            if(maxs.size()<5){

            }
            else{
               // System.out.print(" in else");
                int j=maxs.size()-1;
                int iter=0;
                while(iter<4){
                    query[iter]=maxs.get(j);
                    j--;
                    iter++;
                }
                for(int l=n;l>0;l--){
                    if(!maxs.contains(l) && !skip.contains(l))
                    query[4]=l;
                    break;
                }
                System.out.print("?");
                for(int g=0;g<=4;g++)
                    System.out.print(" "+query[g]);
                System.out.println();
                String[] in=sc.nextLine().split(" ");
                if(Integer.parseInt(in[0])==maxs.get(maxs.size()-2) && Integer.parseInt(in[1])==maxs.get(maxs.size()-1))
                    max=query[4];
                    //break;
            }
            System.out.println("! "+max);
        }
    }
}
