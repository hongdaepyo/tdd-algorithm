package com.dphong.problem.boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_2156 {

    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp = new int[n][3];
        dp[0][0] = 0; // 안먹는 경우
        dp[0][1] = arr[0]; // 하나만 먹고 건너 뛰는 경우
        dp[0][2] = arr[0]; // 두개 연속으로 먹는 경우

        dp[1][0] = arr[1];
        dp[1][1] = arr[1];
        dp[1][2] = arr[1];

        dp[2][0] = arr[1];
        dp[2][1] = arr[1];
        dp[2][2] = arr[1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = 0; // 안먹는 경우
            dp[i][1] = arr[i]; // 하나만 먹고 건너 뛰는 경우
            dp[i][2] = arr[i]; // 두개 연속으로 먹는 경우
        }

        int result = Math.min(Math.min(dp[arr.length - 1][0], dp[arr.length - 1][1]), dp[arr.length - 1][2]);
        System.out.println(result);
    }
}
