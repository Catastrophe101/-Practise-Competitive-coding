package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MATCH2{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] in=br.readLine().split(" ");
            int n=Integer.parseInt(in[0]);
            int q=Integer.parseInt(in[1]);
            String[] a=br.readLine().split(" ");
            String[] b=br.readLine().split(" ");
            int p=0;
            for(int j=0;j<n;j++){
                if(a[j].equals(b[j])){
                    p++;
                }
            }
            //System.out.println("p= "+p);
            for(int k=0;k<q;k++){
                String[] c=br.readLine().split(" ");
                int l=Integer.parseInt(c[0])^p;
                int r=Integer.parseInt(c[1])^p;
                int z=Integer.parseInt(c[2])^p;
                //System.out.println("l= "+l+" r= "+r+" c= "+z);
                for(int h=l-1;h<r;h++) {
                    if (h < n && h >= 0) {
                        a[h] = String.valueOf(z);
                        //System.out.println(a[h]+" h is "+h);
                    }
                }
                int np=0;
                for(int j=0;j<n;j++){
                    if(a[j].equals(b[j])){
                        np++;
                    }
                }
                System.out.println(np);
                p=np;
            }
        }
    }
}