package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B {
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
        long n = sc.nextLong();
        String[] in = sc.nextLine().split(" ");
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int lastKey=-1;
        for (int i = 0; i < in.length; i++) {
//            System.out.println(in[i]);
            if (in[i].equals("1")) {
                int start = i++;
                while (i < in.length && in[i].equals("1")) {
                    i++;
                }
                int end = i;
                if(end==in.length){
                    lastKey=start;
//                    System.out.println("lastKey = " + lastKey);
                }
                hm.put(start, end);
            }
        }
        int max=0;
        for(Map.Entry<Integer,Integer> et:hm.entrySet()){
            if(max<(int)(et.getValue()-et.getKey())){
                max=(et.getValue()-et.getKey());
            }
        }
//        System.out.println(hm);
        if(hm.containsKey(0) && hm.containsValue(in.length)){
            int a=hm.get(0);
//            System.out.println("a = " + a);
            int b=0;
            if(hm.containsKey(lastKey))
            {
                b=hm.get(lastKey)-lastKey;
            }else{
                b=0;
            }
            if(max<(a+b)){
                max=a+b;
            }
        }
        System.out.println(max);
    }
}
