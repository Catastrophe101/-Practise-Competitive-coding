package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class REPSTRING {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String in=br.readLine();
        char[] temp=in.toCharArray();
        TreeMap<Character,Integer> tr=new TreeMap<>();
        for(int i=0;i<temp.length;i++){
            if(!tr.containsKey(temp[i])){
                tr.put(temp[i],1);
            }
            else if(tr.containsKey(temp[i])){
                int n=tr.get(temp[i]);
                n++;
                tr.put(temp[i],n);
            }
        }
        char maxchar=(char) -1;
        int max=-1;
        for(Map.Entry a:tr.entrySet()){
            int tm=(int)a.getValue();
            if(tm>max){
                max=tm;
                maxchar=(char)a.getKey();
            }
        }
        System.out.println(maxchar);
    }
}
