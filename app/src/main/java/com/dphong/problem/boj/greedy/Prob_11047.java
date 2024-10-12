package com.dphong.problem.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob_11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = K;
        int count = 0;
        for (int i = arr.length - 1; i >= 0 && sum > 0; i--) {
            while (sum >= arr[i]) {
                count++;
                sum -= arr[i];
            }
        }

        System.out.println(count);
    }
}
