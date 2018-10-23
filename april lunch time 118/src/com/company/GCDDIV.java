package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDDIV {
    static int gcdcal(int a, int b)
    {
        if (a == 0)
            return b;
        return gcdcal(b % a, a);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int k=0,result=0;
            String[] input=br.readLine().split(" ");
            int n=Integer.parseInt(input[0]);
            k=Integer.parseInt(input[1]);
            String[] data=br.readLine().split(" ");
            result =Integer.parseInt(data[0]);
            for(int j=1;j<n;j++){
                result=gcdcal(Integer.parseInt(data[j]),result);
            }
            if((1<result) && (result<k)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }

    }
}
