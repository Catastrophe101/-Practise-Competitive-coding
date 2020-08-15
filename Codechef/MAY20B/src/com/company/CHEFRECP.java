package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class CHEFRECP {
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
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        while(t-->0){
            HashSet<Integer> num=new HashSet<Integer>();
            HashSet<Integer> sizes=new HashSet<Integer>();
            int n= sc.nextInt();
            String[] data =sc.nextLine().split(" ");
            int currNum=Integer.parseInt(data[0]);
            int currCount=1;
            int flag=0;
            num.add(currNum);
            for(int i=0;i<n;i++){
                System.out.println("currNum = " + currNum);
                System.out.println("currCount = " + currCount);
                if(i<n-1 && Integer.parseInt(data[i+1])==currNum){
                    currCount++;
                }else{
                    if(i<n-1 && num.contains(Integer.parseInt(data[i+1]))) {
                        flag=1;
                        break;
                    }else{
                        sizes.add(currCount);
                        currNum=Integer.parseInt(data[i+1]);
                        num.add(currNum);
                        currCount=1;
                    }
                }
            }

            if(sizes.size()!=num.size() ) {
                flag = 1;
            }
            if(flag==1){
                System.out.println("NO");
            }else
                System.out.println("YES");
        }
    }
}