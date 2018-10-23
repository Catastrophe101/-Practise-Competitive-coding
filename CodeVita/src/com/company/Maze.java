package com.company;
/* Your JAVA Program will come here */
import java.util.*;
import java.io.*;
class Maze{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(br.readLine());
        if(i%2==0){
             i=i/2;
             int[] flag=new int[(i*i)+1];
             flag[0]=1;
             flag[1]=1;
             for(int k=2;k<(i*i)+1;k++) {
                 if (flag[k] == 0) {
                     int h=k;
                     flag[h]=1;
                     for (int l = 2; h < (i * i) + 1; l++) {
                         flag[h] = 1;
                         h = l * k;
                     }
                 }
             }
             int pos,count=0;
                for(int z=0;z<i*i+1;z++){
                    System.out.println(flag[z]);
                }
             for(int m=1;m<i*i+1;m++) {
             if(flag[m]==0){
                 count++;
                 if(count==i){
                     System.out.println(m+1);
                     return;
                 }
             }
             }
        }
        else{
             i=i/2+1;
            int i1=1,i2=1;
            int sum=0;
            if(i<=2)
            {
                System.out.println(i2);
                return;
            }
            else{
                for(int j=2;j<=i;j++){
                    int temp=i2;
                    i2=i1+i2;
                    i1=temp;
                }
                System.out.println(i2);
            }
        }
    }
}