package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DECINC {
        public static void main(String[] args) throws IOException {
            // write your code here
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
            try {
                if (a % 4 == 0) {
                    System.out.println(a + 1);
                } else {
                    System.out.println(a - 1);
                }
            }catch (Exception e){

            }
        }
}
