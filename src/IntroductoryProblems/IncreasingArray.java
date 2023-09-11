package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class IncreasingArray {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = 1;
        while (t-- != 0) {
            solve();
        }
    }

    public static void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        long sum = 0;
        for(int i = 1; i < n; i++) {
            if(a[i] < a[i-1]){
                sum+=a[i-1]-a[i];
                a[i] = a[i-1];
            }
        }
        bw.write(sum+" ");
        bw.flush();
    }
}
