package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TRY {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            int[] b = new int[n];
            String[] in1 = br.readLine().split(" ");
            String[] in2 = br.readLine().split(" ");
            long startTime = System.nanoTime();
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(in1[j]);
                b[j] = Integer.parseInt(in2[j]);
            }
            int[] temp = new int[n];
            int p = 0, flag = 0, esc = 0,f=0;
            ///finding the first difference between 2 series
            for (int k = p; k < n; k++) {
                temp[k] = b[k] - a[k];
            }
            //checking if the 2 series are the same
            int tempP = checkzero(temp);
            if (tempP == -1) {
                esc = 1;
                flag = 1;
            } else {
                p = tempP;
            }
            if (esc != 1) {
                //System.out.println("inside not esc p value is "+p);
                for (f = p; f < n - 2; f++) {
                    //System.out.println("p at starting of while "+p);
                    if (temp[f] >= 1 && temp[f + 1] >= 2 && temp[f + 2] >= 3) {
                        while (temp[f] >= 1 && temp[f + 1] >= 2 && temp[f + 2] >= 3) {
                            temp[f] = temp[f] - 1;
                            temp[f + 1] = temp[f + 1] - 2;
                            temp[f + 2] = temp[f + 2] - 3;
                        }
                    } else {
                        if (temp[f] == 0) {
                            //System.out.println("continue for f = "+f);
                            continue;
                        }
                        break;
                    }
                }
            }
            if(checkzero(temp)==-1)
                flag=1;
            if(flag==1){
                System.out.println("TAK");
            }
            else{
                System.out.println("NIE");
            }
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;
            System.out.println("Execution time in nanoseconds: " + timeElapsed );
        }
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
