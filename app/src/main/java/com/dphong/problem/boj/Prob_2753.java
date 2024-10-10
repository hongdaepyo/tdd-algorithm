package com.dphong.problem.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        System.out.println(solve(year));
    }

    public static int solve(int year) {
        if (year % 4 != 0) {
            return 0;
        }

        if (year % 100 == 0 && year % 400 != 0) {
            return 0;
        }

        return 1;
    }
}
