package com.dphong.problem.boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/1463
 * 다시 풀어볼 필요가 있음.
 * DP
 */
public class Prob_1463 {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 1 <= n <= 10^6
        if (n == 1) {
            System.out.println(0);
            return;
        }

        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 0;

        System.out.println(recur(n));
    }

    static int recur(int n) {
        if (dp[n] == -1) {
            if (n % 6 == 0) {
                dp[n] = Math.min(recur(n / 3), Math.min(recur(n / 2), recur(n - 1))) + 1;
            } else if(n % 3 == 0) {
                dp[n] = Math.min(recur(n / 3), recur(n - 1)) + 1;
            } else if(n % 2 == 0) {
                dp[n] = Math.min(recur(n / 2), recur(n - 1)) + 1;
            } else {
                dp[n] = recur(n - 1) + 1;
            }
        }

        return dp[n];
    }
}
