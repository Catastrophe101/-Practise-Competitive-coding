package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class HMAPPY1 {
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
        String[] in = sc.nextLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int q = Integer.parseInt(in[1]);
        int k = Integer.parseInt(in[2]);
        String[] data1 = sc.nextLine().split(" ");
        char[] data = new char[n];
        for (int l = 0; l < n; l++) {
            data[l] = data1[l].charAt(0);
        }
        char[] query = sc.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder(String.valueOf(data));
        sb.append(sb);
        data = sb.toString().toCharArray();
        HashMap<Integer, Integer> range = getMaxLength(data);
        for (Map.Entry<Integer, Integer> entry : range.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);
        }
        if (range.isEmpty()) {
            //System.out.println("all 0");
            for (int i = 0; i < q; i++) {
                if (query[i] == '?') {
                    System.out.println(0);
                }
            }
        } else if(range.size()==1) {
                for (int i = 0; i < q; i++) {
                    if (query[i] == '?') {
                        System.out.println(n);
                    }
                }
        }else if (range.size() == 2) {
            int s = 2 * n + 1;
            int e = 2 * n + 1;
            for (Map.Entry<Integer, Integer> entry : range.entrySet()) {
                int temp1 = entry.getKey();
                int temp2 = entry.getValue();
                if (temp1 < s && temp2 < e) {
                    s = temp1;
                    e = temp2;
                }
            }
            //System.out.println("s = "+s +"e= "+e);
            int count = e - s + 1;
            for (int i = 0; i < q; i++) {
                if (query[i] == '?') {
                    if (count <= k)
                        System.out.println(count);
                    else System.out.println(k);
                } else if (query[i] == '!') {
                    e++;
                    s++;
                    s = s % n;
                    e = e % n;
                    //System.out.println("s = "+s +"e= "+e);
                    if (s > e) {
                        int t1 = e - 0;
                        int t2 = n - s;
                        if (t1 < t2) {
                            count = t2;
                        } else {
                            count = t1 + 1;
                        }
                    } else count = e - s + 1;
                }
            }
        }else if(range.size()==n) {
            for (int i = 0; i < q; i++) {
                if (query[i] == '?') {
                    System.out.println(1);
                }
            }
        }else {
            //System.out.println("mid case");
                int e2 = 2 * n - 1;
                int s2 = n;
                int count=0;
                int max=0;
               // System.out.println("s2= "+s2+" e2= "+e2);
                for (int i = 0; i < q; i++) {
                    if (query[i] == '?') {
                        for (Map.Entry<Integer, Integer> entry : range.entrySet()) {
                            Integer key = entry.getKey();
                            Integer value = entry.getValue();
                            //System.out.println("s2= "+s2+" e2= "+e2+" key= "+key +" value= "+value);
                            if(key>=s2 && value<=e2){
                                count=(value-key)+1;
                                if(count>max){
                                    max=count;
                                }
                               // System.out.println(max);
                            }else {
                        // System.out.println("in else");
                                if (key >= s2 && key <= e2) {
                                    count = e2 - key + 1;
                                } else if (value >= s2 && value <= e2) {
                                    count = value - s2 + 1;
                                }
                                if (count > max) {
                                    max = count;
                                }
                               // System.out.println(max);
                            }
                            //max=0;
                            count=0;
                        }
                        if (max <= k)
                            System.out.println(max);
                        else System.out.println(k);
                        //System.out.println(max);
                        max=0;
                    } else if (query[i] == '!') {
                        s2--;
                        e2--;
                        if (s2 == -1) {
                            e2 = 2 * n - 2;
                            s2 = n - 1;
                        }
                       // System.out.println("s2= "+s2+" e2= "+e2);
                    }
                }
        }
    }
    static HashMap<Integer,Integer> getMaxLength(char arr[]) {
        int count = 0; //intitialize count
        int max=1;
        int i=0;
        HashMap<Integer,Integer> result=new HashMap<>();
        for (i = 0; i < arr.length; i++) {
            // Reset count when 0 is found
            if (arr[i] == '0') {
                if(count>=1){
                    result.put((i - count),i - 1);
                }
                count = 0;
            } else {
                count++;//increase count
            }
        }
        if(count>=1){
                result.put((i - count),i - 1);
        }
        if (count == arr.length) {
            result.put(0, arr.length/2 - 1);
        }
        return result;
    }
}