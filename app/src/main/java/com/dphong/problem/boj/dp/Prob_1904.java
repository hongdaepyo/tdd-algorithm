package com.dphong.problem.boj.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob_1904 {

    static int[] dp = new int[1000001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 2;

        System.out.println(fib(n));
    }

    static int fib(int n) {
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }
        return dp[n];
    }
}
