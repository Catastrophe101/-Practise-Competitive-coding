package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

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
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String[] data = sc.nextLine().split(" ");
            int n = Integer.parseInt(data[0]);
            int m = Integer.parseInt(data[1]);
            int[] e = new int[n];
            int[] s = new int[n];
            int[] q = new int[m];
            int[] r = new int[m];
            int[] flag = new int[m];
            Arrays.fill(flag, -1);
            for (int j = 0; j < n; j++) {
                String[] in = sc.nextLine().split(" ");
                s[j] = Integer.parseInt(in[2]);
                e[j] = Integer.parseInt(in[2]) + Math.abs(Integer.parseInt(in[0]) - Integer.parseInt(in[1]));
            }
            for (int j = 0; j < m; j++) {
                String[] in = sc.nextLine().split(" ");
                r[j] = Integer.parseInt(in[2]);
                q[j] = Integer.parseInt(in[2]) + Math.abs(Integer.parseInt(in[0]) - Integer.parseInt(in[1]));
            }
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if (s[k] <= r[j] && e[k] > r[j] && e[k] <= q[j]) {
                        flag[j] = k+1;
                    } else if (s[k] >= r[j] && s[k] <= q[j] && e[k] >= r[j] && e[k] <= q[j]) {
                        flag[j] = k+1;
                    } else if (s[k] >= r[j] && s[k] <= q[j] && e[k] >= q[j]) {
                        flag[j] = k+1;
                    }else if(r[j]>=s[k] && r[j]<=e[k] && q[j]<=e[k] && q[j]>=s[k] ){
                        flag[j] = k+1;
                    }
                }
            }
            for (int j = 0; j < m; j++){
                System.out.println(flag[j]);
            }
        }
    }
}
