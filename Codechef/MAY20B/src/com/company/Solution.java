package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    static class Pair{
        int h;
        int k;
        Pair(int height,int ahead){
            this.h=height;
            this.k=ahead;
        }
    }


    public static int[][] reconstructQueue(int[][] people) {
        int n=people.length;
        int[][] data=new int[n][2];
        ArrayList<Pair> zeroAhead=new ArrayList<Pair>();
        ArrayList<Pair> rem=new ArrayList<Pair>();
        ArrayList<Pair> reinsert=new ArrayList<Pair>();
        for(int i=0;i<n;i++){
            if(people[i][1]==0){
                zeroAhead.add(new Pair(people[i][0],people[i][1]));
            }else{
                rem.add(new Pair(people[i][0],people[i][1]));
            }
        }
        Collections.sort(zeroAhead, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.h>o2.h){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        int filledPos=0;
        for(Pair p:zeroAhead){
            data[filledPos][0]=p.h;
            data[filledPos++][1]=p.k;
        }
        for(Pair p:rem){
                System.out.println("element : "+p.h+" "+p.k);
                int ahead=0;
                int j=0;
                while(j<data.length){
                    System.out.println("data[j][0] = " + data[j][0]);
                    System.out.println("people[i][0] = " + p.h);
                    if(data[j][0]>=p.h){
                        ahead++;
                        if(ahead>=p.k){
                           j++;
                            break;
                        }
                    }
                    j++;
                    if(data[j][0]==0){
                        reinsert.add(new Pair(p.h,p.k));
                        break;
                    }
                }
                System.out.println("pos = " + j);
                for(int k=data.length-2;k>=j;k--){
                    data[k+1][0]=data[k][0];
                    data[k+1][1]=data[k][1];
                }
                data[j][0]=p.h;
                data[j][1]=p.k;
                System.out.println("after moving");
                for(int[] d:data){
                    System.out.println(d[0]+" "+d[1]);
                }
            }
        for(Pair p:reinsert){
            System.out.println("element : "+p.h+" "+p.k);
            int ahead=0;
            int j=0;
            while(j<data.length){
                System.out.println("data[j][0] = " + data[j][0]);
                System.out.println("people[i][0] = " + p.h);
                if(data[j][0]>=p.h){
                    ahead++;
                    if(ahead>=p.k){
                        j++;
                        break;
                    }
                }
                j++;
                if(data[j][0]==0){
                    rem.add(new Pair(p.h,p.k));
                    break;
                }
            }
            System.out.println("pos = " + j);
            for(int k=data.length-2;k>=j;k--){
                data[k+1][0]=data[k][0];
                data[k+1][1]=data[k][1];
            }
            data[j][0]=p.h;
            data[j][1]=p.k;
            System.out.println("after moving");
            for(int[] d:data){
                System.out.println(d[0]+" "+d[1]);
            }
        }
//        for(int[] d:data){
//            System.out.println(d[0]+" "+d[1]);
//        }
        return data;
    }

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
     int[][] in=new int[t][2];
     int pos=0;
     while(pos<t){
         String[] data=sc.nextLine().split(" ");
         in[pos][0]=Integer.parseInt(data[0]);
         in[pos++][1]=Integer.parseInt(data[1]);
     }
     reconstructQueue(in);
    }
}