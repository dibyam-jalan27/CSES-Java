package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class PalindromeReorder {
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
        int[] map = new int[26];
        char temp = 'A';
        boolean possible = true;
        for(char c: a.toCharArray()) map[c-'A']++;
        StringBuilder s = new StringBuilder();
        for(int i = 0 ; i < 26 ; i++){
            while(map[i]>=2){
                s.append((char)('A'+i));
                map[i]-=2;
            }
            if(map[i] %2 != 0){
                if(!possible){
                    bw.write("NO SOLUTION");
                    bw.flush();
                    return;
                }
                possible = false;
                temp = (char)('A'+i);
            }
        }
        String k = s.toString() + (possible?"":temp) + s.reverse();
        bw.write(k);
        bw.flush();
    }
}
