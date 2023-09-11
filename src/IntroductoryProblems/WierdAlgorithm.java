package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class WierdAlgorithm{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        int t = 1;
        while(t-- != 0){
            solve();
        }
    }

    public static void solve() throws IOException{
        long n = Long.parseLong(br.readLine());
        while ( n != 1){
            bw.write(n+" ");
            if(n%2 == 0) n=n/2;
            else n = 3*n+1;
        }
        bw.write("1");
        bw.flush();
    }
}
