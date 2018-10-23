package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2B {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] in = br.readLine().split(",");
        int[] data = new int[n];
        int[] data1 = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = Integer.parseInt(in[i]);
        }
        ///debugging
       /* for(int i=0;i<n;i++){
            System.out.println(data[i]);
        }
        */
        int count = 0;
        for (int j = 0; j < n; j++) {
            count = 0;
            while (data[j] > 0) {
                if (data[j] % 2 == 1) {
                    count++;
                }
                data[j] = data[j] / 2;
            }
            data1[j] = count;
        }
        /*for(int i=0;i<n;i++){
            System.out.println(data1[i]);
        }
        */
        int counter=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(data1[i]>data1[j]){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
