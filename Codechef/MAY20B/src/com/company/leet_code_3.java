package com.company;

import java.util.*;

public class leet_code_3 {
    public int twoCitySchedCost(int[][] costs) {
        int output=0,zero_count=0,one_count=0;
        int[][] diff=new int[costs.length][2];
        for(int i=0;i<costs.length;i++){
            diff[i][0]=Math.abs(costs[i][0]-costs[i][1]);
            diff[i][1]=i;
        }
        Arrays.sort(diff, new Comparator<int[]>() {

            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                               final int[] entry2) {
                if (entry1[0] > entry2[0])
                    return 1;
                else
                    return -1;
            }
        });
        for (int[] aDiff : diff) {
            int pos = aDiff[1];
            if (costs[pos][0] > costs[pos][1]) {
                if (one_count < (costs.length / 2)) {
                    output = output + costs[pos][1];
                    one_count++;
                } else {
                    output = output + costs[pos][0];
                    zero_count++;
                }
            } else {
                if (zero_count < (costs.length / 2)) {
                    output = output + costs[pos][0];
                    zero_count++;
                } else {
                    output = output + costs[pos][1];
                    one_count++;
                }
            }
        }
        return output;
    }
}
