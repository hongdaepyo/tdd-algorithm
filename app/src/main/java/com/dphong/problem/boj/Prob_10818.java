package com.dphong.problem.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] nums = new String[N];
        String input = br.readLine();

        System.out.println(solve(input.split(" ")));
    }

    public static String solve(String[] nums) {
        int max = -1000001;
        int min = Integer.MAX_VALUE;

        for (String strNum : nums) {
            int num = Integer.parseInt(strNum);
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }
        return min + " " + max;
    }
}
