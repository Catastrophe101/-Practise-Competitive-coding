package com.company;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Main {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] data=new int[n];
        String[] in=br.readLine().split(" ");
        int sum=0,max=0;
        for(int i=0;i<n;i++){
            data[i]=Integer.parseInt(in[i]);
            sum=sum+Integer.parseInt(in[i]);
            if(Integer.parseInt(in[i])>=max){
                max=Integer.parseInt(in[i]);
            }
        }
        int t=Integer.parseInt(br.readLine());
        for(int j=0;j<t;j++){
            int q=Integer.parseInt(br.readLine());
            if(q>sum)
            {
                System.out.println(-1);
                continue;
            }
            else if(q==sum){
                System.out.println(max);
                continue;
            }
            else{
                Arrays.sort(data);
                //System.out.println("q is "+q+" n is"+n);
                float temp=(float)q/n;
                //System.out.println(temp);
                int avg =(int) Math.ceil(temp);
                //System.out.println("average is "+avg);
                int rem=0,k=0;
                for(k=0;k<n;k++){
                    if(data[k]<=avg){
                        rem=rem+(avg-data[k]);
                    }
                    else break;
                }
                rem = rem -((n*avg)-q);
                //System.out.println("k is "+k);
                //System.out.println("rem is "+rem+" divisor is "+(n-k));
                float add=(float)rem/(n-k);
                //System.out.println("addition is "+add);
                System.out.println(Math.round(add+avg));
            }
        }
    }
}
