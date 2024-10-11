package com.dphong.problem.boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ref: https://iseunghan.tistory.com/343
public class Prob_10844 {

    static long[][] dp;
    static long MOD = 1_000_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 1 <= n <= 100: 길이
        // 인접한 모든 자리의 차이가 1인 수 찾기
        // 0으로 시작하는 수는 계단수가 아님

        dp = new long[n + 1][10];
        for (int i = 0; i < 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            // 0으로 시작하는 수의 개수
            dp[i][0] = dp[i - 1][1];
            for (int j = 1; j < 9; j++) {
                dp[i][j] = (dp[i - 1][j - 1] % MOD + dp[i - 1][j + 1] % MOD) % MOD;
            }
            // 9일 경우는 이전 자릿수의 8로 시작하는 수의 개수와 같다
            dp[i][9] = dp[i - 1][8];
        }

        long result = 0;
        for (int i = 0; i < 10; i++) {
            result = (result + dp[n][i]) % MOD;
        }
        System.out.println(result);
    }
}
