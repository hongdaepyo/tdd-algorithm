package com.dphong.problem.boj.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob_9184 {

    static int[][][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp = new int[21][21][21];
        memoize();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == -1 && b == -1 && c == -1) {
                break;
            }
            System.out.printf("w(%s, %s, %s) = %s%n", a, b, c, w(a, b, c));
        }
    }

    static int w(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            if (dp[0][0][0] == 0) {
                dp[0][0][0] = 1;
            }
            return 1;
        } else if (a > 20 || b > 20 || c > 20) {
            if (dp[20][20][20] == 0) {
                dp[20][20][20] = w(20, 20, 20);
            }
            return dp[20][20][20];
        }
        if (dp[a][b][c] > 0) {
            return dp[a][b][c];
        }
        if (a < b && b < c) {
            dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        }

        if (dp[a][b][c] == 0) {
            dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }
        return dp[a][b][c];
    }

    static void memoize() {
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                for (int k = 0; k < 21; k++) {
                    w(i, j, k);
                }
            }
        }
    }
}
