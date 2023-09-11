package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Repetitions {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = 1;
        while (t-- != 0) {
            solve();
        }
    }

    public static void solve() throws IOException {
        String a = br.readLine();
        int n = a.length();
        int max = 1;
        int curr = 1;
        for (int i = 1; i < n; i++) {
            if(a.charAt(i) == a.charAt(i-1)) curr++;
            else{
                max = Math.max(max,curr);
                curr = 1;
            }
            max = Math.max(curr,max);
        }
        bw.write(max+"");
        bw.flush();
    }
}
