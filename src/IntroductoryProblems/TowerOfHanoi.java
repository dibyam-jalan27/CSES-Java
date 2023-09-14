package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class TowerOfHanoi {
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
        bw.write(((1<<n)-1)+"\n");
        rec(n,'1','3','2');
    }

    public static void rec(int n, char f, char t, char a) throws IOException {
        if(n == 0) return;
        rec(n-1,f,a,t);
        bw.write(f+" "+t+"\n");
        bw.flush();
        rec(n-1,a,t,f);
    }
}
