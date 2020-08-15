package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class DPAIPSn {
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
    public class Entry{
        private long sum;
        private int x,y;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String[] in = sc.nextLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        String[] a = sc.nextLine().split(" ");
        String[] b = sc.nextLine().split(" ");
        long[] la=new long[n];
        long[] lb=new long[m];
        HashMap<Long, Integer> A = new HashMap();
        HashMap<Long, Integer> B = new HashMap();
        HashMap<Long, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            A.put(Long.parseLong(a[i]),i);
            la[i]=Long.parseLong(a[i]);
        }
        for(int i=0;i<m;i++){
            B.put(Long.parseLong(b[i]),i);
            lb[i]=Long.parseLong(b[i]);
        }
        Arrays.sort(la);
        Arrays.sort(lb);
        int left=0,right=m-1;
        while(right>=0) {
            long sum=la[left]+lb[right];
            if(hm.containsKey(sum)){
             left++;
            }else {
                //System.out.println(A.get(la[left])+" "+B.get(lb[right]));
                hm.put(sum, 0);
                System.out.println(A.get(la[left])+" "+B.get(lb[right]));
            }
            if(left==n-1){
                left=0;
                right--;
            }
            if(hm.size()==(n+m-1)){
                break;
            }
        }
        /*
        long sum=Long.parseLong(a[0])+Long.parseLong(b[0]);
        hm.put(sum, new double[]{0,0});
        int count = n + m - 1;
        int flag=0;
        for (int i = 0; i < n; i++) {
            if(flag==1)
                break;
            for (int j = 0; j < m; j++) {
                if (hm.containsKey(Long.parseLong(a[i]) + Long.parseLong(b[j])))
                    continue;
                else
                    hm.put(Long.parseLong(a[i]) + Long.parseLong(b[j]), new double[]{Double.valueOf(i), Double.valueOf(j)});
                if (hm.size() == count) {
                    flag=1;
                    break;
                }
            }
        }
        */
        /*for(Long key:hm.keySet()){
            int[] temp=hm.get(key);
            System.out.println(key+" "+(temp[0])+" "+(temp[1]));
            /*count--;
            if(count==0){
                break;
            }
        }*/
    }
}
