package com.dphong.problem.boj.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob_1932 {

    static boolean[][] visited;
    static int[][] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        dp = new int[n][n];
        visited = new boolean[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = arr[0][0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + arr[i][j];
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + arr[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + arr[i][j];
                }
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, dp[n - 1][i]);
        }
        System.out.println(result);
    }
}
