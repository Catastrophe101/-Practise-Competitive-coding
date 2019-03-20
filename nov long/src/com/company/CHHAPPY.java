package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CHHAPPY {
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
        long t = sc.nextLong();
        for (long i = 0; i < t; i++) {
            int n = sc.nextInt();
            String[] in = sc.nextLine().split(" ");
            if (n < 3) {
                System.out.println("Poor Chef");
                continue;
            } else if (n < 10000) {
                int[] a = new int[n+1];
                for (int j = 1; j < n+1; j++) {
                    a[j] = Integer.parseInt(in[j-1]);
                }
                int flag = 0;
                for (int j = 1; j < n + 1; j++) {
                    for (int k = 1; k < n + 1; k++) {
                        if (a[j] < a.length && a[k] < a.length && a[j]!= a[k] && a[a[j]] == a[a[k]]) {
                            flag = 1;
                            break;
                        }
                    }
                }
                if (flag == 1) {
                    System.out.println("Truly Happy");
                } else {
                    System.out.println("Poor Chef");
                }
            } else {
                int[][] a = new int[n][2];
                for (int j = 0; j < n; j++) {
                    a[j][0] = Integer.parseInt(in[j]);
                    a[j][1] = j + 1;
                }
                sort(a, 0, n - 1);
                int flag = 0;
                for (int j = 0; j < n - 1; j++) {
                    if (a[j][0] == a[j + 1][0]) {
                        //System.out.println("temp is "+temp[j]+"g= "+g+" h= "+h);
                        if (binarySearch(a, 0, a.length - 1, a[j][1]) != -1 && binarySearch(a, 0, a.length - 1, a[j + 1][1]) != -1) {
                            flag = 1;
                            break;
                        }
                    }
                }
                if (flag == 1) {
                    System.out.println("Truly Happy");
                } else System.out.println("Poor Chef");
            }
        }
    }
   static void merge(int[][] arr, int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[][] = new int [n1][2];
        int R[][] = new int [n2][2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
        {
            L[i][0] = arr[l + i][0];
            L[i][1] = arr[l + i][1];
        }

        for (int j=0; j<n2; ++j) {
            R[j][0] = arr[m + 1 + j][0];
            R[j][1] = arr[m + 1 + j][1];
        }

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i][0] <= R[j][0])
            {
                arr[k][0] = L[i][0];
                arr[k][1] = L[i][1];
                i++;
            }
            else
            {
                arr[k][0] = R[j][0];
                arr[k][1] = R[j][1];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k][0] = L[i][0];
            arr[k][1] = L[i][1];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k][0] = R[j][0];
            arr[k][1] = R[j][1];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[][], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    static int binarySearch(int arr[][], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;

            // If the element is present at the
            // middle itself
            if (arr[mid][0] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid][0] > x)
                return binarySearch(arr, l, mid-1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid+1, r, x);
        }

        // We reach here when element is not present
        //  in array
        return -1;
    }
}
