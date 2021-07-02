package com.dphong.problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob_1330 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solve(input));
    }

    public static String solve(String input) {
        StringTokenizer st = new StringTokenizer(input);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        return solve(a, b);
    }

    public static String solve(int a, int b) {
        String result;
        if (a < b) {
            result = "<";
        } else if (a > b) {
            result = ">";
        } else {
            result = "==";
        }
        return result;
    }
}
