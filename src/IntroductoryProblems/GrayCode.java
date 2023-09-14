package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class GrayCode {
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
        boolean[] b = new boolean[n+1];
        bw.write("0".repeat(n)+"\n");
        for (int i = 1; i < (1<<n); i++) {
            int LSB = Integer.numberOfTrailingZeros(i) +1;
            b[LSB] ^= true;
            for(int j = n ; j > 0; j--) bw.write(b[j]?"1":"0");
            bw.write("\n");
        }
        bw.flush();
    }
}
