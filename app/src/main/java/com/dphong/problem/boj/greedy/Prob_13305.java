package com.dphong.problem.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob_13305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] distances = new long[N - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            distances[i] = Integer.parseInt(st.nextToken());
        }
        long[] costs = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            costs[i] = Integer.parseInt(st.nextToken());
        }
        if (N == 2) {
            System.out.println(distances[0] * costs[0]);
            return;
        }

        long sum = costs[0] * distances[0];
        long minCost = costs[0];
        for (int i = 1; i < N - 1; i++) {
            if (costs[i] < minCost) {
                minCost = costs[i];
            }
            sum += minCost * distances[i];
        }

        System.out.println(sum);
    }

}
