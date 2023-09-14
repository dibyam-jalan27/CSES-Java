package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class CoinPiles {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- != 0) {
            solve();
        }
    }

    public static void solve() throws IOException {
        String[] arr = br.readLine().split(" ");
        long a = Long.parseLong(arr[0]);
        long b = Long.parseLong(arr[1]);
        if((2*a-b)%3 == 0 && 2*a-b >= 0) {
            if((2*b-a)%3 == 0 && 2*b-a >= 0) bw.write("YES\n");
            else bw.write("NO\n");
        }
        else bw.write("NO\n");
        bw.flush();
    }
}
