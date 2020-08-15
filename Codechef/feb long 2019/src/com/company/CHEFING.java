package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CHEFING {
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
            HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
            int n = sc.nextInt();
            char[] temp = sc.nextLine().toCharArray();
            for (int k = 0; k < temp.length; k++) {
                hm.put(temp[k], 0);
            }
            for (int j = 1; j < n; j++) {
                temp = sc.nextLine().toCharArray();
                for (int k = 0; k < temp.length; k++) {
                    if(hm.containsKey(temp[k])) {
                        if (hm.get(temp[k]) == j - 1) {
                            hm.put(temp[k], j);
                        }
                    }
                }
            }
            int count=0;
            for(Map.Entry<Character ,Integer> e: hm.entrySet()){
                if(e.getValue()==n-1){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
