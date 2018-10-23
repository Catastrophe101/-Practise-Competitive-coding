package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class M2D {
    public static void main (String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] curr=br.readLine().toCharArray();
        char[] path=br.readLine().toCharArray();
        for(int i=0;i<path.length;i++){
            switch (path[i]){
                case'F':{
                    switch (curr[0]){
                        case 1:
                    }
                }
            }
        }
    }
}
