package com.dphong.problem.boj.dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prob_24416 {

    static int[] dp;
    static int answer1;
    static int answer2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        fib(n);
        fibonacci(n);
        System.out.println(answer1 + " " + answer2);
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            answer1++;
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static int fibonacci(int n) {
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            answer2++;
        }
        return dp[n];
    }
}
