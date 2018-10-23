package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HOWMANY {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum;
            int a = Integer.parseInt(br.readLine());
            sum=0;
            while (a > 0) {
                sum++;
                a=a/10;
            }
            if(sum>3)
            System.out.println("More than 3 digits");
            else {
                System.out.println(sum);
            }
        }
    }
