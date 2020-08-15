import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
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
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            ArrayList<String> positiveData=new ArrayList<>();
            ArrayList<String> negativeData=new ArrayList<>();
            String[] in=sc.nextLine().split(" ");
            for(int j=0;j<n;j++){
                if(Integer.parseInt(in[j])>0){
                    positiveData.add(in[j]);
                }else{
                    negativeData.add(in[j]);
                }
            }
            if(positiveData.size()==0 || negativeData.size()==0) {
                if (positiveData.size() != 0)
                    System.out.println(positiveData.size() + " " + positiveData.size());
                else if (negativeData.size() != 0) {
                    System.out.println(negativeData.size() + " " + negativeData.size());
                }
            }else if(negativeData.size()>positiveData.size()){
                System.out.println(negativeData.size()+" "+positiveData.size());
            }else if(negativeData.size()<positiveData.size()){
                System.out.println(positiveData.size()+" "+negativeData.size());
            }else if(negativeData.size()==positiveData.size()){
                System.out.println(positiveData.size()+" "+negativeData.size());
            }
        }
    }
}
