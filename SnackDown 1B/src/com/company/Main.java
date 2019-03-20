package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] in = br.readLine().split(" ");
            long n = Long.parseLong(in[0]);
            long k = Long.parseLong(in[1]);
            long a[] = new long[(int) k];
            int j = 0;
            long sum = 0;
            for (j = 0; j < k - 1; j++) {
                a[j] = j + 1;
                sum = sum + a[j];
            }
            if (n - sum > j)
                a[j] = n - sum;
            else {
                System.out.println("-1");
                continue;
            }
            ArrayList<long[]> col = new ArrayList<>();
            col.add(Arrays.copyOf(a, (int) k));
            /*for (j = 0; j < k ; j++){
                System.out.println(a[j]);
            }*/
            // long[] temp = a;
            long end = k - 1;
            int flag = 0;
            int count=0;
            while (flag == 0) {
                if (a[(int) end] - a[(int) end - 1] >= 3) {
                    // System.out.println("End is at "+end);
                    while (a[(int) end] - a[(int) end - 1] >= 3) {
                        //System.out.println("in while 1");
                        a[(int) end]--;
                        a[(int) end - 1]++;
                        col.add(Arrays.copyOf(a, (int) k));
                    }
                } else if (a[(int) end] - a[(int) end - 1] == 2) {
                    // System.out.println("End is at "+end);
                    for (int l = (int) end - 1; l > 0; l--) {
                        //System.out.println("in for ");
                        if (a[l] - a[l - 1] >= 2) {
                            a[(int) end]--;
                            a[l - 1]++;
                            col.add(Arrays.copyOf(a, (int) k));
                            break;
                        }
                    }
                } else
                    end = end - 1;
                if(end==0){
                    break;
                }
                   // System.out.println(end);
                   if (end == 1) {
                        if (a[(int) end] - a[(int) end - 1] >= 3) {
                            // System.out.println("End is at "+end);
                            while (a[(int) end] - a[(int) end - 1] >= 3) {
                                //System.out.println("in while 1");
                                a[(int) end]--;
                                a[(int) end - 1]++;
                                col.add(Arrays.copyOf(a, (int) k));
                            }
                        }
                        if(count==k-1)
                            flag = 1;
                        end=k-1;
                        count++;
                    }
            }
            for (long[] str : col) {
                for (int p = 0; p < str.length; p++)
                    System.out.print(str[p] + " ");
                System.out.println();
            }
        }
    }
}