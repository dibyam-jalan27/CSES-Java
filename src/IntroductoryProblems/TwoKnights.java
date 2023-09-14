package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class TwoKnights {
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
        for(long i = 1; i <= n; i++) {
            long l = i*i;
            long total = (l*(l-1))/2;
            long sub = (i - 2) *(i-1)*2*2;
            bw.write((total-sub)+"\n");
        }
        bw.flush();
    }
}
