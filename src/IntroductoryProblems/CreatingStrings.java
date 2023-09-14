package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class CreatingStrings {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = 1;
        while (t-- != 0) {
            solve();
        }
    }

    static List<String> ls = new ArrayList<>();
    static char[] s;
    static int n;
    public static void solve() throws IOException {
        String a = br.readLine();
        n = a.length();
        boolean[] taken = new boolean[n];
        char[] str = a.toCharArray();
        Arrays.sort(str);
        s = new char[n];
        back(taken,str,0);
        bw.write(ls.size()+"\n");
        for(String i: ls) bw.write(i+"\n");
        bw.flush();
    }

    public static void back(boolean[] taken, char[] a, int len) {
        if(len == n){
            ls.add(String.valueOf(s));
            return;
        }
        for(int i = 0; i < n ; i++) {
            if(!taken[i]) {
                if(i > 0 && a[i] == a[i-1] && !taken[i-1]) continue;
                s[len] = a[i];
                taken[i] = true;
                back(taken,a,len+1);
                taken[i] = false;
            }
        }
    }
}
