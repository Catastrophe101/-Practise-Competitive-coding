package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DIFNEIGH {
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
    public static void main(String[] args){
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            String[] in = sc.nextLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int m = Integer.parseInt(in[1]);
            int[][] map = new int[n + 1][m + 1];
            //Arrays.fill(map,0);
            int maxcol = 2;
            int temp = 1;
            if (n < 2 && m < 2) {
                if(n==1 && m==1){
                    System.out.println(1);
                    System.out.println(1);
                }
                else if(n==1){
                    if(m<3)
                    System.out.println(1);
                    else
                        System.out.println(2);
                    for (int j = 1; j < m + 1; j++) {
                        map[1][j] = temp;
                        if (j % 2 == 0) {
                            if (temp == 1)
                                temp = 2;
                            else temp = 1;
                        }
                    }
                    for (int j = 1; j < m + 1; j++) {
                        if(j==m){
                            System.out.println(map[1][j]);
                        }
                        else
                        System.out.println(map[1][j]+" ");
                    }
                }
            } else {
                for (int j = 1; j < n + 1; j++) {
                    for (int k = 1; k < m + 1; k++) {
                        for (int c = 1; c <= maxcol; c++) {
                            boolean res1 = true, res2 = true, res3 = true, res4 = true;
                            if (j - 1 > 0) {
                                res1 = checkn(map, n, m, j - 1, k, j, k, c);
                            }
                            if (j + 1 <= n) {
                                res2 = checkn(map, n, m, j + 1, k, j, k, c);
                            }
                            if (k + 1 <= m) {
                                res3 = checkn(map, n, m, j, k + 1, j, k, c);
                            }
                            if (k - 1 > 0) {
                                res4 = checkn(map, n, m, j, k - 1, j, k, c);
                            }
                            if (res1 && res2 && res3 && res4) {
                                map[j][k] = c;
                                break;
                            } else {
                                if (c == maxcol) {
                                    maxcol++;
                                    map[j][k] = maxcol;
                                    break;
                                }
                            }
                        }
                    }
                }
            System.out.println(maxcol);
            for (int x = 1; x < n + 1; x++) {
                for (int y = 1; y < m + 1; y++) {
                    if(y==m){
                        System.out.print(map[x][y]);
                    }
                    else
                    System.out.print(map[x][y] + " ");
                }
                System.out.println("");
            }
        }
        }
    }
    public static boolean checkn(int[][] map, int n, int m, int x, int y, int qx, int qy, int col){
        if(x-1>0&& map[x-1][y]==col){
            return false;
        }
        if(x+1<=n && map[x+1][y]==col){
            return false;
        }
        if(y+1<=m && map[x][y+1]==col){
            return false;
        }
        if(y-1>0 && map[x][y-1]==col){
            return false;
        }
        return true;
    }

}
