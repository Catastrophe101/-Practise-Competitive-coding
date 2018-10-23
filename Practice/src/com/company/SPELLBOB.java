package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SPELLBOB {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int[] flag=new int[n];
            char[] up=br.readLine().toCharArray();
            char[] down=br.readLine().toCharArray();
            for(int j=0;j<3;j++){
                if(up[j]=='b' && flag[0]==0){
                    flag[0]=j+1;
                }else if(up[j]=='o') {
                    flag[1] = j+1;
                }else if(up[j]=='b' && flag[0]!=0){
                    flag[2]=j+1;
                }
            }
           /*
            for(int h=0;h<n;h++){
                System.out.println(flag[h]);
            }
            */
            int fg=0;
            if(flag[0]==0){
                for(int k=0;k<3;k++){
                    if(down[k]=='b' && (flag[0]!=k+1 || flag[1]!=k+1 || flag[2]!=k+1)){
                    flag[0]=k+1;
                    break;
                    }
                }
            }
            if(flag[1]==0){
                for(int k=0;k<3;k++){
                    if(down[k]=='o' && (flag[0]!=k+1 || flag[1]!=k+1 || flag[2]!=k+1)){
                        flag[1]=k+1;
                        break;
                    }
                }
            }
            if(flag[2]==0){
                for(int k=0;k<3;k++){
                    if(down[k]=='b' && (flag[0]!=k+1 || flag[1]!=k+1 || flag[2]!=k+1)){
                        flag[2]=k+1;
                        break;
                    }
                }
            }
            if(flag[0]+flag[1]+flag[2]==6)
                System.out.println("yes");
            else {
                System.out.println("no");
            }
        }
    }
}
