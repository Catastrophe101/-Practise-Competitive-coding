package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SKMP {
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
        while(t-->0) {
            char[] s = sc.nextLine().toCharArray();
            char[] p = sc.nextLine().toCharArray();
            String[] parts = new String[(s.length - p.length) + 1];
            int partsCount = 0;
            HashMap<Character, Integer> pCount = new HashMap<Character, Integer>();
            for (char aP : p) {
                if (pCount.containsKey(aP)) {
                    pCount.put(aP, pCount.get(aP) + 1);
                } else {
                    pCount.put(aP, 1);
                }
            }
            for (char aS : s) {
                if (pCount.containsKey(aS)) {
                    if (pCount.get(aS) > 0) {
                        pCount.put(aS, pCount.get(aS) - 1);
                        continue;
                    } else {
                        pCount.remove(aS);
                    }
                }
                parts[partsCount++] = String.valueOf(aS);
            }
            StringBuilder sb=new StringBuilder();
            parts[partsCount++] = String.valueOf(p);
            Arrays.sort(parts,new lexSortComp());
            for (String str : parts){
                sb.append(str);
            }
            System.out.println(sb);
        }
    }
   static class lexSortComp implements Comparator<String>
    {
        // Used for sorting in ascending order of
        // roll number
        public int compare(String a, String b)
        {
            return (a + b).compareTo(b + a);
        }
    }

}
