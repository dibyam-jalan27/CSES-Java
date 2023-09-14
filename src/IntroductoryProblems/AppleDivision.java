package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class AppleDivision {
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
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr[i]);
            sum+=a[i];
        }
        bw.write(sol(0,a,sum,0)+"");
        bw.flush();
    }

    public static long sol(int i, int[] a, long sum, long currSum) {
        if(i == a.length) return Math.abs(sum-2*currSum);
        return Math.min(sol(i+1,a,sum,currSum+a[i]),sol(i+1,a,sum,currSum));
    }
}
