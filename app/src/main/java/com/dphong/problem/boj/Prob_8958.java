package com.dphong.problem.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_8958 {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        while (count-- > 0) {
            sb.append(solve(br.readLine())).append(System.lineSeparator());
        }

        System.out.println(sb);
    }

    public static int solve(String input) {
        int totalScore = 0;
        int nowScore = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'O') {
                nowScore++;
                totalScore += nowScore;
            } else {
                nowScore = 0;
            }
        }
        return totalScore;
    }
}
