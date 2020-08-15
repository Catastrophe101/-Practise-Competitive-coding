package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HP18 {
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
        for (int j = 0; j < t; j++) {
            String[] in = sc.nextLine().split(" ");
            int n = Integer.parseInt(in[0]);
            int a = Integer.parseInt(in[1]);
            int b = Integer.parseInt(in[2]);
            String[] data=sc.nextLine().split(" ");
            int[] flag=new int[n];
            int tera=0,terb=0;
            long counta=0,countb=0,both=0;
            int div=a,chance=0,countera=-1,counterb=-1;
            /*while(true) {
                if (chance == 0) {
                    while (tera != 1) {
                        countera++;
                        System.out.println("countera "+countera);
                        if (countera > n-1) {
                            tera=1;
                            break;
                        }
                        if (Long.parseLong(data[countera]) % a == 0 && flag[countera]!=1) {
                            flag[countera] = 1;
                            chance=1;
                            break;
                        }
                    }
                } else if (chance == 1) {
                    while (terb != 1) {
                        counterb++;
                        System.out.println("counterb "+counterb);
                        if (counterb > n-1) {
                            terb=1;
                            break;
                        }
                        if (Long.parseLong(data[counterb]) % b == 0 && flag[counterb]!=1) {
                            flag[counterb] = 1;
                            chance=0;
                            break;
                        }
                    }
                }
                if(tera==1){
                    System.out.println("ALICE");
                    break;
                }
                else if(terb==1){
                    System.out.println("BOB");
                    break;
                }
            }*/
                for (int i = 0; i < n; i++) {
                    if(Long.parseLong(data[i]) % a == 0 && Long.parseLong(data[i]) % b == 0){
                        both++;
                    }
                    else if (Long.parseLong(data[i]) % a == 0) {
                        counta++;
                    }
                    else if (Long.parseLong(data[i]) % b == 0) {
                        countb++;
                    }
                }
            while(true){
                    if(both>0){
                        //System.out.println("Chance "+chance+" both "+both);
                        if(chance==0){
                            both=0;
                            chance=1;
                        }
                        else if(chance==1){
                            both=0;
                            chance=0;
                        }
                    }
                    else if(chance==0 && counta>0){
                        //System.out.println("Chance "+chance+" counta "+counta);
                        counta--;
                        chance=1;
                    }
                    else if(chance==1 && countb>0){
                        //System.out.println("Chance "+chance+" countb "+countb);
                        countb--;
                        chance=0;
                    }
                    if(both==0 && counta==0 && chance==0){
                        //System.out.println("Chance "+chance+" both "+both);
                        System.out.println("ALICE");
                        break;
                    }
                if(both==0 && countb==0 && chance==1){
                    //System.out.println("Chance "+chance+" both "+both);
                        System.out.println("BOB");
                        break;
                }
            }
        }

    }
}
