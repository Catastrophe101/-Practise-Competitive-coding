package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SHkNUM {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            int flag=0;
            int in = Integer.parseInt(br.readLine());
            for(int p=0;p<20;p++) {
                if (in == (int) Math.pow(2, p)) {
                    System.out.println("1");
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
                continue;
            StringBuilder bf = new StringBuilder();
            while (in != 0) {
            bf.append(in%2);
            in=in/2;
            }
            char[] a=bf.toString().toCharArray();
            int count=0;
            //System.out.println(a);
            StringBuilder sb=new StringBuilder();
            for(int j=a.length-1;j>=0;j--){
                if(a[j]=='1' && count<=2){
                count++;
                }
               if(count>2)
                sb.append(a[j]);
            }
            //System.out.println(sb.toString());
            int out=0;
            char[] b=sb.toString().toCharArray();
            if(b.length>0) {
                int powc=0;
                for (int l = b.length-1; l >= 0; l--) {
                    out = (int) (out + (Integer.parseInt(String.valueOf(b[l])) * (Math.pow(2, powc++))));
                }
            }
            System.out.println(out);
        }
    }
}