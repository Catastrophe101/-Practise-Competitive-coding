package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DEVCLASS {
    public static void main(String args[]) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String in=br.readLine();
        char[] a=in.toCharArray();
        int countB=0,countG=0;
        int[] posB=new int[in.length()],posG=new int[in.length()];
        for(int i=0;i<in.length();i++){
            if(a[i]=='B'){
                posB[countB]=i;
                countB++;
            }
            else if(a[i]=='G'){
                posG[countG]=i;
                countG++;
            }
        }
        int usedB=0,usedG=0,sum=0;
        for(int j=0;j<in.length()-1;j++){
            if(a[j]==a[j+1] && a[j]=='B'){
                if(countG>=0 && posG[usedG]>j+1) {
                    char t = a[j + 1];
                    a[j + 1] = a[posG[usedG]];
                    a[posG[usedG]] = t;
                    usedG++;
                    countG--;
                    sum=sum+posG[usedG]-j+1;
                }
                else {
                    usedG++;
                //    sum=-1;
                }
                }
            else if(a[j]==a[j+1] && a[j]=='G'  ) {
                if (countB >= 0 && posB[usedB] > j + 1) {
                    char t = a[j + 1];
                    a[j + 1] = a[posB[usedB]];
                    a[posB[usedB]] = t;
                    usedB++;
                    countB--;
                    sum=sum+posB[usedB]-j+1;
                }
                else{
                    usedB++;
                    //sum=-1;
                }
            }
        }
        System.out.println(sum);
    }
}
