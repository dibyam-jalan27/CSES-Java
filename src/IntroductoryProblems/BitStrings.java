package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class BitStrings {
    static final int MOD = (int)1e9 +7;
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
        long ans = 1;
        for(int i = 0; i < n;i++){
            ans = (ans*2)%MOD;
        }
        bw.write(ans+"");
        bw.flush();
    }
}
