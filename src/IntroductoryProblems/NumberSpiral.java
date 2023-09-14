package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class NumberSpiral {
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
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        
    }
}
