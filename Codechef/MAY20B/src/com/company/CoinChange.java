package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CoinChange {
    public static int change(int amount, int[] coins) {
       return ways(amount,coins,new StringBuilder()).size();
    }
    public static HashSet<StringBuilder> ways(int amount, int[] coins, StringBuilder coin){
        HashSet<StringBuilder> s=new HashSet<StringBuilder>();
        if(amount==0){
            char[] sorted=coin.toString().toCharArray();
            Arrays.sort(sorted);
            s.add(new StringBuilder(String.valueOf(sorted)));
            return s;
        }else{
            if(amount>0){
                for(int i=0;i<coins.length;i++){
                    s.addAll(ways(amount-coins[i],coins,coin.append(coins[i])));
                }
                return s;
            }
            return s;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int amount=Integer.parseInt(br.readLine());
        String[] coin=br.readLine().split(" ");
        int[] coins=new int[coin.length];
        for(int i=0;i<coin.length;i++){
            coins[i]=Integer.parseInt(coin[i]);
        }
        System.out.println(change(amount,coins));
    }
}
