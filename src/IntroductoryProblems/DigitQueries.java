package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class DigitQueries {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        int t = Integer.parseInt(br.readLine());
        while(t-- != 0){
            solve();
        }
    }

    public static void solve() throws IOException{
        long k = Long.parseLong(br.readLine());
        long l = 1;
        long temp = 9;
        long sum = 0;
        for(int i = 1 ; i < 24 ; i++ ) {
            if(k<= temp*i) break;
            k-= temp*i;
            sum+=temp;
            temp*=10;
            l++;
        }
        k--;
        long rem = k%l;
        k = k/l;
        sum+=k+1;
        char ans = String.valueOf(sum).charAt((int)rem);
        bw.write(ans+"\n");
        bw.flush();
    }
}
