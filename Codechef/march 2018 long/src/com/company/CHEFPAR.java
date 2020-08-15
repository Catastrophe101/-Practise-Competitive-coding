package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHEFPAR {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int count=0;
        for (int i = 0; i < t; i++) {
            count=0;
            int n = Integer.parseInt(br.readLine());
            int[] data = new int[n];
            String[] in = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                data[j] = Integer.parseInt(in[j]);
            }
            for(int l=0;l<n-1;l++){
                for(int m=l+1;m<n;m++){
                    float sum = data[m]+data[l];
                    sum=sum/2;
                    if(search(data,sum)!= -1){
                        //System.out.println(l+" "+m+" "+sum);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }
    static int search(int[] a, float x){
        for(int i=0;i<a.length-1;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }

}
