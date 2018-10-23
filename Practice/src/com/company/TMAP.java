package com.company;

import java.util.TreeMap;

public class TMAP {
    public static void main(String args[])

    {
            TreeMap<Integer,Integer> tv=new TreeMap<>();
        int n = 00;
        for (int i = 100; i > 0; i--) {
                tv.put(i,n);
                n++;
        }
        for(int k=0;k<50;k++){
            System.out.println(tv);
        }
    }
}
