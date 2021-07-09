package com.dphong.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob_10871 {
    private static StringTokenizer st;
    private static int limit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        limit = Integer.parseInt(st.nextToken());

        System.out.println(solve(br.readLine()));
    }

    public static String solve(String intStrings) {
        st = new StringTokenizer(intStrings);

        StringBuilder sb = new StringBuilder();

        while(st.hasMoreTokens()) {
            int tempInteger = Integer.parseInt(st.nextToken());
            if (tempInteger < limit) {
                sb.append(tempInteger).append(" ");
            }
        }

        return sb.toString();
    }
}
