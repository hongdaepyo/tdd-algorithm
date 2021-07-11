package com.dphong.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_2562 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        int max = -1;
        int position = 0;
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > max) {
                max = num;
                position = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(position);
    }
}
