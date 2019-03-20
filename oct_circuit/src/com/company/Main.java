package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
        String[] in=br.readLine().split(" ");
        int n=Integer.parseInt(in[0]);
        int a=Integer.parseInt(in[1]);
        int b=Integer.parseInt(in[2]);
        
        }
    }
}
