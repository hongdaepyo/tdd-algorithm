package com.dphong.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        System.out.println(solve(a, b, c));
    }

    public static String solve(int a, int b, int c) {
        int multiplyResult = a * b * c;

        int[] arr = new int[10];
        char[] chars = String.valueOf(multiplyResult).toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int num = chars[i] - '0';
            arr[num]++;
        }

        return getResult(arr);
    }

    private static String getResult(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }

       return sb.toString();
    }
}
