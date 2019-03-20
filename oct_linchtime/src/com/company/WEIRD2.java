package com.company;

import javax.print.attribute.standard.PrintQuality;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class WEIRD2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String[] in = br.readLine().split(" ");
            TreeMap<Integer, Integer> tm = new TreeMap<>();
            int[] data = new int[n];
            for (int j = 0; j < n; j++) {
                data[j] = Integer.parseInt(in[j]);
                if (tm.containsKey(data[j])) {
                    int a = tm.get(data[j]);
                    a++;
                    tm.put(data[j], a);
                } else {
                    tm.put(data[j], 1);
                }
            }
            int count = 0;
            for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
                int a = entry.getValue();
                for (int j = a; j > 0; j--) {
                    if (tm.containsKey(j)) {
                        if (tm.get(j) >= a) {
                            count++;
                        }
                    }
                }

            }
            System.out.println(count);
        }
    }
}
