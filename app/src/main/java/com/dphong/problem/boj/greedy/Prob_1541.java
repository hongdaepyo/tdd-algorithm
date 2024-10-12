package com.dphong.problem.boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob_1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, "-");
        String[] arr = new String[st.countTokens()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken();
            if (arr[i].contains("+")) {
                arr[i] = plusFromStr(arr[i]);
            }
        }

        int result = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            result -= Integer.parseInt(arr[i]);
        }

        System.out.println(result);
    }

    static String plusFromStr(String str) {
        StringTokenizer st = new StringTokenizer(str, "+");
        int result = 0;
        while (st.hasMoreTokens()) {
            result += Integer.parseInt(st.nextToken());
        }
        return String.valueOf(result);
    }
}
