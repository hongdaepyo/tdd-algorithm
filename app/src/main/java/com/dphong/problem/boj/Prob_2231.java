package com.dphong.problem.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strN = br.readLine();
        int n = Integer.parseInt(strN);

        int answer = 0;
        for (int i = n - strN.length() * 9; i < n; i++) {
            int sum1 = getSumOfPositionNumbers(i);
            if (sum1 + i == n) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }

    public static int getSumOfPositionNumbers(int n) {
        if (n < 10) {
            return n;
        }

        return n % 10 + getSumOfPositionNumbers(n / 10);
    }
}
