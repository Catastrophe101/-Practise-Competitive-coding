package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Nothing {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n=Long.parseLong(br.readLine());
        TreeMap<Long,Long> A=new TreeMap<Long,Long>();
        TreeMap<Long,Long> B=new TreeMap<Long,Long>();
        TreeMap<Long,Long> C=new TreeMap<Long,Long>();
        String[] data=br.readLine().split(" ");
        long x=Long.parseLong(data[0]);
        long y=Long.parseLong(data[1]);
        long z=Long.parseLong(data[2]);
        for(int i=0;i<n;i++){
            data=br.readLine().split(" ");
            long tx=Long.parseLong(data[0]);
            long ty=Long.parseLong(data[1]);
            long tz=Long.parseLong(data[2]);
            A.put(tx,(long)i);
            B.put(ty,(long)i);
            C.put(tz,(long)i);
        }
        long out=0;
        Set<Long> visited = new HashSet<Long>();
        while(x>0 || y>0 || z>0){
            long newvisit =-1;
            if(x>0 && A.lastKey()>=B.lastKey && A.lastKey()>=C.lastKey){
                newvisit=A.get(A.lastKey());
                if(visited.contains(newvisit)){
                    A.remove(A.lastKey());
                }
                else{
                    x--;
                    out=out+A.lastKey();
                    A.remove(A.lastKey());
                }
            }
            else if(y>0 && B.lastKey()>=A.lastKey() && B.lastKey()>=C.lastKey){
                newvisit=B.get(B.lastKey());
                if(visited.contains(newvisit)){
                    B.remove(B.lastKey());
                }else{
                    y--;
                    out=out+B.lastKey();
                    B.remove(B.lastKey());
                }
            }else if(z>0 && C.lastKey()>=A.lastKey && C.lastKey()>=B.lastKey){
                newvisit=C.get(C.lastKey());
                if(visited.contains(newvisit)){
                    C.remove(C.lastKey());
                }else{
                    z--;
                    out=out+C.lastKey();
                    C.remove(C.lastKey());
                }
            }
            visited.add(newvisit);
        }
        System.out.println(out);
    }

}
