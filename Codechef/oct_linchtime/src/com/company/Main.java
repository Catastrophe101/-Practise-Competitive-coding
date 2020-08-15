package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] in = br.readLine().split(" ");
            int x = Integer.parseInt(in[0]);
            int y = Integer.parseInt(in[1]);
            int z = Integer.parseInt(in[2]);
            int c = 1000;
            //00
            if((counta(c,z)== countb(c,y)+x) ||(counta(c,z)== countb(c,y)-x)){
                System.out.println("yes");
            }else//10
                if((counta(c,-z)== countb(c,y)+x) ||(counta(c,-z)== countb(c,y)-x)){
                System.out.println("yes");
            }else //01
                if((counta(c,z)== countb(c,-y)+x) ||(counta(c,z)== countb(c,y)-x)){
                System.out.println("yes");
            }else //11
                    if((counta(c,-z)== countb(c,-y)+x) ||(counta(c,-z)== countb(c,-y)+x)){
                    System.out.println("yes");
        }else{
                System.out.println("no");
                    }
    }
    }

    public static int counta(int c,int z) {
        return c-z;
    }

    public static int countb(int c,int y) {
    return  c+y;
    }
}