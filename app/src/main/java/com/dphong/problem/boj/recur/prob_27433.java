package com.dphong.problem.boj.recur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prob_27433 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            System.out.println(factorial(N));
        }
        System.out.println(factorial(N));
    }

    static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return factorial(n - 1) * n;
    }
}
