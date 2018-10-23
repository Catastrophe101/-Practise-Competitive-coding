package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URCALC {
    public static  void main(String args[])throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        double a= Double.parseDouble(br.readLine());
        double b= Double.parseDouble(br.readLine());
        String c=br.readLine();
        switch(c){
            case"+":System.out.println(a+b);
            break;
            case"-":System.out.println(a-b);
                break;
            case"*":System.out.println(a*b);
                break;
            case"/":System.out.println(a/b);
                break;
        }

    }
}
