package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(",");
        int[] index = new int[Integer.parseInt(in[0])];
        int[][] store = new int[Integer.parseInt(in[0])][Integer.parseInt(in[1])];
        for (int i = 0; i < Integer.parseInt(in[0]); i++) {
            String[] temp = br.readLine().split(",");
            for (int j = 0; j < Integer.parseInt(in[1]); j++) {
                store[i][j] = Integer.parseInt(temp[j]);
            }
        }
       /* for (int k = 0; k < Integer.parseInt(in[0]); k++) {
            for (int l = 0; l < Integer.parseInt(in[1]); l++) {
                System.out.print(store[k][l] + " ");
            }
            System.out.println();
        }
        */
        for (int i = 0; i < Integer.parseInt(in[0]); i++) {
            index[i] = Integer.parseInt(in[1]) - 1;
        }
        int max = 0;
        int maxpos = 0;
        String out="";
        for(int i=0;i<Integer.parseInt(in[0])*Integer.parseInt(in[1]);i++){
            {
                max=0;
                maxpos=0;
                for(int j=0;j<Integer.parseInt(in[0]);j++){
                    if(index[j]>=0) {
                        if (store[j][index[j]] >= max) {
                            max = store[j][index[j]];
                            maxpos = j;
                        }
                    }
                }
                out=out+String.valueOf(store[maxpos][index[maxpos]]);
                index[maxpos]--;
            }
           // System.out.println(out);
        }
        System.out.println(out);
    }
}
