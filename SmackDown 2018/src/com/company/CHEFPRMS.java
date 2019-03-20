package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHEFPRMS {
    static int[] ref={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int s1=0,e1=ref.length-1;
        int s2=0,e2=1;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int n1=0,n2=0;
            while(e1 > 0 && s1 < ref.length && e1 < s1){
                if(n <= ref[s1]*ref[e1]){
                    e1--;
                }
                else if(n  > ref[s1]*ref[e1]){
                    n2 = n - ref[s1]*ref[e1];

                }
            }
        }
    }
    static int checkp(int a){
        int s=0,e=ref.length-1;
        while(e > 0 && s < ref.length && e > s){
            if(a < ref[s]*ref[e]){
                e--;
            }
            if(a  > ref[s]*ref[e]){
                s++;
            }
            if(a==ref[s]*ref[e]){
                return 1;
            }
        }
        return 0;
    }
}
