package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Maxeptry {
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
        int ne = Integer.parseInt(in[0]);
        int c = Integer.parseInt(in[1]);
        int n=ne;
        int coin=1000;
        int val=1;
        int dif=0;
        int low=0;
        int flag=1;
        int ret=0;
        while(flag==1 && coin>0){
            dif=(int)Math.sqrt(n);
            for(val=low+dif;val<=ne;val=val+dif){
                if(val>ne)
                    val=ne;
                coin--;
                System.out.println("1 "+val);
                ret=sc.nextInt();
                if(dif==1 && ret==1){
                    coin=coin-c;
                    System.out.println("2");
                    flag=0;
                    break;
                }
                else if(ret==1){
                    coin=coin-c;
                    System.out.println("2");
                    low=val-dif;
                    n=dif;
                    break;
                }
            }
        }
        //System.out.println("coin "+coin);
        System.out.println("3 "+val);
        /*
        int ret;
        int n;
        int low=1,high=ne;
        n=high;
        int i=0;
        int y =(int)Math.sqrt(n);
        while(high-low!=1) {
            System.out.println("coins "+coin);
            System.out.println("y= "+y);
            for(i=low;i<=ne;i=i+y){
                if(i>ne){
                    i = ne;
                    break;
                }
                System.out.println("1 "+i);
                ret=sc.nextInt();
                if(ret==1){
                    coin=coin-c;
                    if(coin<0){
                        break;
                    }
                    low=i-y+1;
                    high=i;
                    System.out.println("2");
                    ret=0;
                    break;
                }
                n=high-low;
                y =(int)Math.sqrt(n);
                coin--;
            }
            if(coin<0){
                break;
            }
        }
        System.out.println("3 "+i);
    */}
}
