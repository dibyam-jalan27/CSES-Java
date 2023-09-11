package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class MissingNumber {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = 1;
        while (t-- != 0) {
            solve();
        }
    }

    public static void solve() throws IOException {
        long n = Long.parseLong(br.readLine());
        long sum = 0;
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < n-1; i++) {
            sum += Long.parseLong(arr[i]);
        }
        long temp = n*(n+1)/2;
        bw.write((temp-sum)+" ");
        bw.flush();
    }
}
