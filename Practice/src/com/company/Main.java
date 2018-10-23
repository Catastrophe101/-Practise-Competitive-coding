package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b= Integer.parseInt(br.readLine());
        if(a>b){
            System.out.println(a-b);
        }
        else if(b>a){
            System.out.println(a+b);
        }
    }
}
