package IntroductoryProblems;

import java.io.*;
import java.util.*;
import java.lang.*;

public class ChessboardAndQueens {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = 1;
        while (t-- != 0) {
            solve();
        }
    }

    static boolean[] row = new boolean[8];
    static HashSet<Integer> diagonal1 = new HashSet<>();
    static HashSet<Integer> diagonal2 = new HashSet<>();
    public static void solve() throws IOException {
        String[] board = new String[8];
        for (int i = 0; i < 8; i++) {
            board[i] = br.readLine();
        }
        bw.write(sol(0,board)+"");
        bw.flush();
    }

    public static int sol(int i, String[] board) {
        if(i == 8) return 1;

        int ans = 0;
        for(int j = 0; j < 8; j++){
            if(board[i].charAt(j) == '.') {
                if(!row[j] && !diagonal1.contains(i-j) && !diagonal2.contains(i+j)){
                    row[j] = true;
                    diagonal1.add(i-j);
                    diagonal2.add(i+j);
                    ans+= sol(i+1,board);
                    row[j] = false;
                    diagonal1.remove(i-j);
                    diagonal2.remove(i+j);
                }
            }
        }
        return ans;
    }
}
