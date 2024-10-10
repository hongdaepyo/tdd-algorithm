package com.dphong.problem.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while (c-- > 0) {
            st = new StringTokenizer(br.readLine());

            int sum = 0;
            int num = Integer.parseInt(st.nextToken());
            int[] arr = new int[num];

            for (int i = 0; i < num; i++) {
                int n = Integer.parseInt(st.nextToken());
                sum += n;
                arr[i] = n;
            }

            float avg = (float) sum / num;

            int over = (int) Arrays.stream(arr).filter(n -> n > avg).count();

            System.out.println(String.format("%.3f%%", (float) over / num * 1000 / 1000 * 100));
        }

    }
}
