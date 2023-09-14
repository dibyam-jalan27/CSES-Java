package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class TwoSet {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = 1;
        while (t-- != 0) {
            solve();
        }
    }

    static List<Long> l1 = new ArrayList<>();
    static List<Long> l2 = new ArrayList<>();

    public static void solve() throws IOException {
        long n = Long.parseLong(br.readLine());
        long sum = (n*(n+1))/2;
        if(sum%2 != 0) {
            bw.write("NO");
            bw.flush();
            return;
        }
        sum /= 2;
        List<Long> l1 = new ArrayList<>();
        List<Long> l2 = new ArrayList<>();
        for(long i = n; i >= 1; i--) {
            if(sum - i >= 0){
                l1.add(i);
                sum-=i;
            }
            else {
                l2.add(i);
            }
        }
        bw.write("YES\n");
        bw.write(l1.size()+"\n");
        for(long i: l1) bw.write(i+" ");
        bw.write("\n"+l2.size()+"\n");
        for(long i : l2) bw.write(i+" ");
        bw.flush();
    }
}
