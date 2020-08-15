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
            int test =Integer.parseInt(br.readLine());
            if(test%10==0 )
            {
                System.out.println("0");
            } else if(test%5==0){
                System.out.println("1");
            }
            else {
                System.out.println("-1");
            }
        }
    }
}
