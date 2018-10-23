package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] in=br.readLine().split(",");
        int M1=0,M2=0,d1=-1,d2=-1,h1=-1,h2=-1,m1=-1,m2=-1;
        int[] data=new int[in.length];
        int[] flag=new int[in.length];
        for(int i=0;i<in.length;i++){
            data[i]=Integer.parseInt(in[i]);
        }

        Arrays.sort(data);
        int i=0;
            while(data[i]<=1 && i<in.length){
                i++;
            }
            i--;
            if(i>=0) {
                if (i == 0 && data[i] > 1) {
                    System.out.println(0);
                    return;
                } else {
                    M1 = data[i];
                    flag[i] = 1;
                    //System.out.println(M1);
                }
                if (M1 == 0) {
                    int max = data[i];
                    while (++i < in.length) {
                        if (data[i] > max) {
                            max = data[i];
                        }
                    }
                    i--;
                    M2 = max;
                    flag[i]=1;
                }
                else if(M1==1) {
                    int j = 0;
                    while (j < in.length && data[j] <= 2) {
                        j++;
                    }
                   // System.out.println(data[j]);
                    j--;
                    while(flag[j]!=0 &&j>0){
                            j--;
                        }
                        M2=data[j];
                        flag[j]=1;
                    }
                }
        //System.out.println(M1+" "+M2);
            if(M1==1)
            {
                int j=0;
                if(M2==0){
                    while(data[j]<=3 && j<in.length){
                        j++;
                    }
                    j--;
                    while(flag[j]!=0 && j>0){
                        j--;
                    }
                    d1=data[j];
                    flag[j]=1;
                }
                if(M2==1){
                    while(data[j]<=3 && j<in.length){
                        j++;
                    }
                    j--;
                    while(flag[j]!=0 && j>0){
                        j--;
                    }
                    d1=data[j];
                    flag[j]=1;
                }
                if(M2==2){
                    while(data[j]<=3){
                        j++;
                    }
                    j--;
                    while(flag[j]!=0 && j>0){
                        j--;
                    }
                    d1=data[j];
                    flag[j]=1;
                }

            }
           //System.out.println(d1);
        /*for(int k=0;k<in.length;k++){
            System.out.print(flag[k]+" ");
        }*/

           if(d1==-1){
               System.out.println(0);
               return;
           }
           if(d1<3){
               int j=0;
               int max = data[j];
               while (++j < in.length) {
                   if (data[j] > max) {
                       max = data[j];
                   }
               }
               j--;
               while(flag[j]!=0 && j>0){
                   j--;
               }
               d2=data[j];
               flag[j]=1;
           }
        if(d1==3){
            int j=0;
            while(data[j]<=1 && j<in.length){
                j++;
            }
            j--;
            while(flag[j]!=0 && j>0){
                j--;
            }
            d2=data[j];
            flag[j]=1;
        }
        /*System.out.println(M1+""+M2+" / "+d1+""+d2);
        for(int k=0;k<in.length;k++){
            System.out.print(flag[k]+" ");
        }*/

        if(d2==-1){
            System.out.println(0);
            return;
        }
        int k=0;
        while(data[k]<=2 && k<in.length){
            k++;
        }
        k--;
        while(flag[k]!=0 && k>0){
            k--;
        }
        h1=data[k];
        flag[k]=1;
        if(h1==-1) {
        System.out.println(0);
        return;
        }
        if(h1==2){
            int j=0;
            while(data[j]<=4 && j<in.length){
                j++;
            }
            j--;
            while(flag[j]!=0 && j>0){
                j--;
            }
            h2=data[j];
            flag[j]=1;
        }
        if(h1<2){
            int j=0;
            while(data[j]<=4 && j<in.length){
                j++;
            }
            j--;
            while(flag[j]!=0 && j>0){
                j--;
            }
            h2=data[j];
            flag[j]=1;
        }
        if(h2==-1){
            System.out.println(0);
            return;
        }
        /*System.out.println(M1+""+M2+" / "+d1+""+d2+" "+h1+""+h2);
        for(int h=0;h<in.length;h++){
            System.out.print(flag[h]+" ");
        }
        */
        {
            int l=0;
            while(data[l]<=5 && l<in.length){
                l++;
            }
            l--;
            while(flag[l]!=0 && l>0){
                l--;
            }
            m1=data[l];
            flag[l]=1;
        }
        if(m1==-1){
            System.out.println(0);
            return;
        }
        {
            int l=0;
            int max = data[l];
            while (++l < in.length) {
                if (data[l] > max) {
                    max = data[l];
                }
            }
            l--;
            while(flag[l]!=0 && l>0){
                l--;
            }
            m2=data[l];
            flag[l]=1;
        }
        if(m2==-1){
            System.out.println(0);
            return;
        }
        System.out.println(M1+""+M2+"/"+d1+""+d2+" "+h1+""+h2+":"+m1+""+m2);
       /* for(int h=0;h<in.length;h++){
            System.out.print(flag[h]+" ");
        }*/
    }
}
