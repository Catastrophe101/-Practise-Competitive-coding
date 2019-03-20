package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            double tt = 0;
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Double> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                String in = br.readLine();
                if (map.containsKey(in)) {
                    Double w = map.get(in);
                    tt = tt + w/2;
                    map.put(in, w / 2);
                } else {
                    char[] temp = in.toCharArray();
                    int set = 0;
                    double nt=0;
                    for (int k = 0; k < temp.length; k++) {
                        if (set == 0) {
                            if ((temp[k] == 'd') || (temp[k] == 'f')) {
                                set = 2;
                            } else if ((temp[k] == 'j') || (temp[k] == 'k')) {
                                set = 1;
                            }
                            nt =(nt + 0.2);
                        } else if (temp[k] == 'd') {
                            if (set == 1)
                                nt = (nt + 0.2);
                            else nt = (nt + 0.4);
                            set = 2;
                        } else if (temp[k] == 'f') {
                            if (set == 1) {
                                nt =  (nt + 0.2);
                            } else nt =(nt + 0.4);
                            set = 2;
                        } else if (temp[k] == 'j') {
                            if (set == 2) {
                                nt =(nt + 0.2);
                            } else nt =(nt + 0.4);
                            set = 1;
                        } else if (temp[k] == 'k') {
                            if (set == 2) {
                                nt =  (nt + 0.2);
                            } else nt = (nt + 0.4);
                            set = 1;
                        }
                       // System.out.println("k= " + k + " tt is " + nt);
                    }
                    tt=tt+nt;
                    map.put(in,nt);
                }
            }
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(0);
            System.out.println(df.format(tt*10));
            }
        }
}
