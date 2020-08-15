package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        while(t-->0){
            int n=sc.nextInt();
            String[] data=sc.nextLine().split(" ");
            int[] window=new int[3];
            window[0]=0;
            window[1]=1;
            window[2]=2;
            if(n<=3){
                if (Integer.parseInt(data[window[1]]) <= Integer.parseInt(data[window[0]])
                        && Integer.parseInt(data[window[0]]) <= Integer.parseInt(data[window[2]])
                        ||
                        Integer.parseInt(data[window[1]]) >= Integer.parseInt(data[window[0]])
                                && Integer.parseInt(data[window[0]]) >= Integer.parseInt(data[window[2]])) {
                    window[0] = n;
                }else
                if (Integer.parseInt(data[window[0]]) <= Integer.parseInt(data[window[1]])
                        && Integer.parseInt(data[window[1]]) <= Integer.parseInt(data[window[2]])
                        ||
                        Integer.parseInt(data[window[0]]) >= Integer.parseInt(data[window[1]])
                                && Integer.parseInt(data[window[1]]) >= Integer.parseInt(data[window[2]])
                        ) {
                    window[1] = n;
                } else if (Integer.parseInt(data[1]) <= Integer.parseInt(data[2])
                        && Integer.parseInt(data[2]) <= Integer.parseInt(data[0])
                        ||
                        Integer.parseInt(data[1]) >= Integer.parseInt(data[2])
                                && Integer.parseInt(data[2]) >= Integer.parseInt(data[0])){
                    window[2] = n;
                }
            }
            else{
            for(int i=3;i<=n;i++) {
                if (Integer.parseInt(data[window[1]]) <= Integer.parseInt(data[window[0]])
                        && Integer.parseInt(data[window[0]]) <= Integer.parseInt(data[window[2]])
                        ||
                        Integer.parseInt(data[window[1]]) >= Integer.parseInt(data[window[0]])
                                && Integer.parseInt(data[window[0]]) >= Integer.parseInt(data[window[2]])) {
                    window[0] = i;
                }else
                if (Integer.parseInt(data[window[0]]) <= Integer.parseInt(data[window[1]])
                        && Integer.parseInt(data[window[1]]) <= Integer.parseInt(data[window[2]])
                        ||
                        Integer.parseInt(data[window[0]]) >= Integer.parseInt(data[window[1]])
                                && Integer.parseInt(data[window[1]]) >= Integer.parseInt(data[window[2]])
                        ) {
                    window[1] = i;
                } else if (Integer.parseInt(data[1]) <= Integer.parseInt(data[2])
                        && Integer.parseInt(data[2]) <= Integer.parseInt(data[0])
                        ||
                        Integer.parseInt(data[1]) >= Integer.parseInt(data[2])
                                && Integer.parseInt(data[2]) >= Integer.parseInt(data[0])){
                    window[2] = i;
                }
            }
            }
            Arrays.sort(window);
            System.out.println(data[window[0]]+" "+data[window[1]]);
        }
    }
}
