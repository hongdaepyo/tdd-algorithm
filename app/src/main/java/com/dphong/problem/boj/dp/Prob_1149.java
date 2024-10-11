package com.dphong.problem.boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob_1149 {

    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][3];
        dp = new int[n][3];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int priceR = Integer.parseInt(st.nextToken());
            int priceG = Integer.parseInt(st.nextToken());
            int priceB = Integer.parseInt(st.nextToken());

            if (i == 0) {
                dp[0][0] = priceR;
                dp[0][1] = priceG;
                dp[0][2] = priceB;
            } else {
                dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + priceR;
                dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + priceG;
                dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + priceB;
            }
        }

        int result = Math.min(Math.min(dp[arr.length - 1][0], dp[arr.length - 1][1]), dp[arr.length - 1][2]);
        System.out.println(result);
    }
}
