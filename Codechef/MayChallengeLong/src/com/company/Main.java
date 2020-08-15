package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n= Integer.parseInt(br.readLine());

            String[] in=br.readLine().split(" ");
            int x=0;
            for(int j=0;j<n;j++){
                for(int k=j;k<n;k++){
                    if(k==j) {
                        x = x ^ (Integer.parseInt(in[j]) + Integer.parseInt(in[k]));
                    }
                    else{
                        x = x ^ (Integer.parseInt(in[j]) + Integer.parseInt(in[k]));
                        x = x ^ (Integer.parseInt(in[k]) + Integer.parseInt(in[j]));
                    }
                }
            }
            System.out.println(x);
        }
    }
}
