package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MAXEP {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String[] in = sc.nextLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int c = Integer.parseInt(in[1]);
        int y = (int) Math.sqrt(n);
        int val = 1;
        int ret = 10;
        int coins = 1000;
        if (n < 1000) {
            for (int i = 1; val <= n; i++) {
                val = y * i;
                if (val > n) {
                    break;
                }
                System.out.println("1 " + val);
                ret = sc.nextInt();
                if (ret == 1) {
                    coins = coins - c;
                    System.out.println("2");
                    break;
                }
                coins--;
                if (coins < 0) {
                    break;
                }
            }
            //System.out.println(val);
            if (val > n) {
                val = n;
            }
            val = val - y;
            while (coins > 0) {
                coins--;
                val++;
                System.out.println("1 " + val);
                ret = sc.nextInt();
                if (ret == 1) {
                    System.out.println(2);
                    coins = coins - c;
                    break;
                }
            }
            System.out.println("3 " + val);
        } else {
            for (int i = 1; val <= n; i++) {
                val = y * i;
                if (val > n) {
                    break;
                }
                System.out.println("1 " + val);
                ret = sc.nextInt();
                if (ret == 1) {
                    coins = coins - c;
                    System.out.println("2");
                    break;
                }
                coins--;
                if (coins < 0) {
                    break;
                }
            }
            //System.out.println(val);
            if (val > n) {
                val = n;
            }
            val = val - y;
            while (coins > 0) {
                coins--;
                //System.out.println("coins at "+coins);
                val = val + 2;
                System.out.println("1 " + val);
                ret = sc.nextInt();
                if (ret == 1) {
                    System.out.println(2);
                    coins = coins - c;
                    val--;
                    System.out.println("1 " + val);
                    ret = sc.nextInt();
                    if (ret == 1) {
                        System.out.println(2);
                        coins = coins - c;
                        break;
                    } else {
                        val++;
                        break;
                    }
                }
            }
            System.out.println("3 " + val);
        }
    }
}