package com.dphong.problem.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[43];

        int idx = 10;
        int count = 0;
        while (idx-- > 0) {
            int num = Integer.parseInt(br.readLine());
            int remain = num % 42;

            if (arr[remain] == 0) {
                count++;
            }

            arr[remain]++;
        }

        System.out.println(count);
    }
}
