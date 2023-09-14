package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Permutations {
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
        if(n == 1){
            bw.write("1");
            bw.flush();
            return;
        }
        if(n < 4){
            bw.write("NO SOLUTION");
            bw.flush();
            return;
        }
        int temp = n%2 == 0?n-1:n;
        while(temp > 0) {
            bw.write(temp+" ");
            temp -= 2;
        }
        temp = n%2 != 0?n-1:n;
        while(temp > 0) {
            bw.write(temp+" ");
            temp -= 2;
        }
        bw.flush();
    }
}
