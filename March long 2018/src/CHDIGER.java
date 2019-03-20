import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class CHDIGER {
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
            String[] data = sc.nextLine().split(" ");
            long num = Long.parseLong(data[0]);
            long d = Long.parseLong(data[1]);
            TreeMap<Integer ,String> hm=new TreeMap<>();
            StringBuilder sb = new StringBuilder();
            long min=d;
            while (num > 0) {
                int ntemp= (int) (num%10);
//                String tem=hm.get((int)ntemp);
//                if(ntemp>=d){
//                 tem=tem+String.valueOf(d);
//                }else {
//                    tem = tem + String.valueOf(ntemp);
//                }
//                hm.put((int) ntemp,tem);
                if(ntemp<min){
                    min=ntemp;
                }
                sb.append(ntemp);
                num = num / 10;
            }
            System.out.println("min = " + min);
            sb.reverse();
            StringBuilder tem=new StringBuilder();
            for(int j=0;j<sb.length();j++){
                if(Integer.parseInt(String.valueOf(sb.charAt(j)))==min){
                    tem.append(Integer.parseInt(String.valueOf(sb.charAt(j))));
                    for(int k=j+1;k<sb.length();k++){
                        tem.append(Integer.parseInt(String.valueOf(sb.charAt(k))));
                    }
                }
            }
            System.out.println(tem);
//            for(Map.Entry a:hm.entrySet()){
//                sb.append(a.getValue());
//            }
            System.out.println(Long.parseLong(sb.toString().trim()));
        }
    }
}
