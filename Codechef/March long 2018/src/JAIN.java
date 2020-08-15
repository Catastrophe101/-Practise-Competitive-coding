import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class JAIN {
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
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            TreeSet<Integer>[] ts = new TreeSet[5];
            ts[0]=new TreeSet<>();
            ts[1]=new TreeSet<>();
            ts[2]=new TreeSet<>();
            ts[3]=new TreeSet<>();
            ts[4]=new TreeSet<>();
            String[] data = new String[n];
            for(int j=0;j<n;j++){
                data[j]=sc.nextLine();
            }
            for (int j = 0; j < n; j++) {
                if(data[j].contains("a")){
                    ts[0].add(j);
                }
                if(data[j].contains("e")){
                    ts[1].add(j);
                }
                if(data[j].contains("i")){
                    ts[2].add(j);
                }
                if(data[j].contains("o")){
                    ts[3].add(j);
                }
                if(data[j].contains("u")){
                    ts[4].add(j);
                }
            }
            System.out.println(ts[0].toString());
            System.out.println(ts[1].toString());
            System.out.println(ts[2].toString());
            System.out.println(ts[3].toString());
            System.out.println(ts[4].toString());
            int minset=0;
            int minsize=ts[0].size();
            for(int k=0;i<5;i++){
                if(ts[k].size()<minsize){
                    minset=k;
                }
            }
            int count=0;
           for(Integer it:ts[minset]) {
                for (int l = 0; l < n; l++) {
                    int first=it;
                    if (first!=l) {
                        int second=l;
                        if((ts[0].contains(first) || ts[0].contains(second)) &&
                                (ts[1].contains(first) || ts[1].contains(second)) &&
                                        ( ts[2].contains(first) || ts[2].contains(second) )&&
                                                (ts[3].contains(first) || ts[3].contains(second)) &&
                                                        ( ts[4].contains(first) || ts[4].contains(second))){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
