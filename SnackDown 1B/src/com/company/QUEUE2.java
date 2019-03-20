package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class QUEUE2 {

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }




    public static void main(String[] args) throws Exception {
        // write your code here
        try {
            FastReader sc=new FastReader();
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                long n = sc.nextInt();
                long m = sc.nextInt();
                long k = sc.nextInt();
                long l = sc.nextInt();
                long[] data = new long[Math.toIntExact(n)];
                for (long p = 0; p < n; p++) {
                    data[Math.toIntExact(p)] = sc.nextInt();;
                }
                long wait;
                Arrays.sort(data);
                long minwt = 999999999L;
                long count = 0;
                for (long j = 1; j <= k; j++) {
                    if (count < data.length && j > data[Math.toIntExact(count)]) {
                        count++;
                    }
                    //System.out.println(count +"at j "+j);
                    if (l> 0 && (j / l) < 0 ) {
                        wait = count * l;
                    } else {
                        if(l> 0 )
                            wait = (((m - j / l) + count) * l) - (j % l);
                        else wait=0;
                    }
                    if (minwt > wait) {
                        minwt = wait;
                    }
                    //System.out.println(binarySearch(data,j));
                }
        /*for(int q=1;q<=k;q++){
                System.out.println("q= "+q+" wait time"+ waitlist[q]);
        }*/
                System.out.println(minwt + l);
            }
        }catch(Exception e){
            return;
        }

    }

}