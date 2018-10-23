package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            char[] in = br.readLine().toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < in.length; j++) {
                char a= (char) ((((in[j]-96)+in[j])%26)+96);
               // System.out.println(a);
                if(a=='`')
                    a='z';
                sb.append(a);
            }
            System.out.println(sb.toString());
        }
    }
}
