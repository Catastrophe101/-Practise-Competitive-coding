package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        while (n > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] data = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    data[i][j] = sc.nextInt();
                }
            }
            int flag=0;
                for (int i = 0; i < r; i++) {
                    if(flag==1)
                        break;
                    for (int j = 0; j < c; j++) {
                        if (!check(data, i, j,r,c)) {
                            System.out.println("Unstable");
                            flag=1;
                            break;
                        }
                    }
                }
                if(flag==0)
                System.out.println("Stable");
                n--;
            }
        }
    public static boolean check(int[][] data,int i,int j,int r,int c){
        int count=0;
        if(i+1<r)
            count++;
        if(i-1>-1)
            count++;
        if(j+1<c)
            count++;
        if(j-1>-1)
            count++;
        if(count>data[i][j])
        return true;
        else return false;
    }
    }

