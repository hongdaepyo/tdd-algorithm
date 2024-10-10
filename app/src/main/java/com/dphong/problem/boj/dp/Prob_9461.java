package com.dphong.problem.boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_9461 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (c-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(solve(n)).append("\n");
        }

        System.out.println(sb);
    }

    private static long solve(int n) {
        if (n < 4) {
            return 1;
        }
        long[] dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }
}
