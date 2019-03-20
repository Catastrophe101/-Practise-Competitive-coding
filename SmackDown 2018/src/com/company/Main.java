package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] temp = new int[n];
            String[] in1 = br.readLine().split(" ");
            String[] in2 = br.readLine().split(" ");
            long startTime = System.nanoTime();
            for (int j = 0; j < n; j++) {
                temp[j] = Integer.parseInt(in2[j]) - Integer.parseInt(in1[j]);
            }
            int p = 0, flag = 0, esc = 0,f=0;
            //checking if the 2 series are the same
            int tempP = checkzero(temp);
            if (tempP == -1) {
                esc = 1;
                flag = 1;
            } else {
                p = tempP;
            }
            if (esc != 1) {
                for (f = p; f < n - 2; f++) {
                    if(temp[f]==0)
                        continue;
                    else if(temp[f] >= 1 && temp[f + 1] >= 2 && temp[f + 2] >= 3) {
                        int tmp=min((temp[f]/1),(temp[f+1]/2),(temp[f+2]/3));
                        temp[f]=temp[f]-tmp*1;
                        temp[f+1]=temp[f+1]-tmp*2;
                        temp[f+2]=temp[f+2]-tmp*3;
                    }
                    if(temp[f]!=0){
                        flag=0;
                        break;
                    }
                }
            }
            if((f==n-2 || flag==1 ) && (temp[n-1]==0 && temp[n-2]==0 && temp[n-3]==0)){
                System.out.println("TAK");
            }
            else{
                System.out.println("NIE");
            }
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;
            System.out.println("Execution time in NANOseconds: " + timeElapsed );
        }
    }
    static int min(int a,int b,int c){
        if(a<=b && a<=c){
            return a;
        }
        else if(b<=a && b<=c)
        {
            return b;
        }
        else return c;
    }
    static int checkzero (int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                return i;
            }
        }
        return -1;
    }
}
