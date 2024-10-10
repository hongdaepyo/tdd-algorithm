package com.dphong.problem.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Prob_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solve(Integer.parseInt(input)));
    }

    public static String solve (int score) {
        return Grade.symbol(score);
    }

    private enum Grade {
        A(90),
        B(80),
        C(70),
        D(60),
        F(0);

        public int lowLimit;

        Grade(int lowLimit) {
            this.lowLimit = lowLimit;
        }

        public static String symbol(int score) {
            return Arrays.stream(Grade.values())
                    .filter(grade -> score >= grade.lowLimit)
                    .findFirst()
                    .get()
                    .name();
        }
    }
}
