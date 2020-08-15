package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String[] in=br.readLine().split(" ");
            int n=Integer.parseInt(in[0]);
            int x=Integer.parseInt(in[1]);
            int s=Integer.parseInt(in[2]);
            for(int j=0;j<s;j++){
                String[] trial=br.readLine().split(" ");
                if(Integer.parseInt(trial[0])==x){
                    x=Integer.parseInt(trial[1]);
                }
                else if(Integer.parseInt(trial[1])==x){
                    x=Integer.parseInt(trial[0]);
                }
            }
            System.out.println(x);
        }
    }
}
