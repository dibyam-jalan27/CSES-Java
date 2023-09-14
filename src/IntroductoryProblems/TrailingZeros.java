package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class TrailingZeros {
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
        int ans = 0;
        for(int i = 5; i <= Math.min((int)1e9,n);i*=5) {
            ans+=n/i;
        }
        bw.write(ans+"");
        bw.flush();
    }
}
