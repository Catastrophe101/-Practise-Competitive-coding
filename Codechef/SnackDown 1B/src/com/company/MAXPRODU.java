package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class MAXPRODU {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] in = br.readLine().split(" ");
            long n = Long.parseLong(in[0]);
            long k = Long.parseLong(in[1]);
            long a[] = new long[(int) k];
            long high, low;
            int q = 0;
            long sum = 0;
            for (q = 0; q < k - 1; q++) {
                sum = sum + q + 1;
            }
            if (n - sum <= q) {
                System.out.println("-1");
                continue;
            }
            //System.out.println((double)n/k);
            long div = (long) Math.ceil((double) n / k);
            //System.out.println(div);
            long ext = div * k - n;
            //System.out.println(ext);
            for (int j = 0; j < k; j++) {
                a[j] = div;
            }
            if (k % 2 == 0) {
                high = k / 2;
                low = (k / 2) - 1;
                int count = 0;
                while (low >= 0 && high <= k - 1) {
                    count++;
                    a[(int) low] -= count;
                    a[(int) high] += count;
                    low--;
                    high++;
                }
            } else {
                high = k / 2 + 1;
                low = k / 2 - 1;
                int count = 0;
                while (low >= 0 && high <= k - 1) {
                    count++;
                    a[(int) low] -= count;
                    a[(int) high] += count;
                    low--;
                    high++;
                }
            }
            while (ext != 0) {
                for (long l = 0; l <= k - 1; l++) {
                    if (a[(int) l] > 2) {
                        a[(int) l]--;
                        ext--;
                        if (ext == 0)
                            break;
                    }
                }
            }
            for (int g = 0; g < k; g++) {
                System.out.print(a[g] + " ");
            }
            System.out.println();
            BigInteger out = new BigInteger(String.valueOf(1));
            for (int g = 0; g < k; g++) {
                BigInteger b1 = new BigInteger(String.valueOf(a[g]));
                BigInteger b2 =b1.pow(2) ;
                BigInteger b3=b2.subtract(b1);
                out = out.multiply(b3);
            }
            System.out.println(out);
        }
    }
}
