package com.dphong.problem.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prob_2884 {
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String timeString = br.readLine();
        System.out.println(solve(timeString));
    }

    public static String solve(String timeString) {
        st = new StringTokenizer(timeString);
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int minutes = timeToMinutes(hour, minute);

        if (minutes >= 45) {
            minutes -= 45;
        } else {
            minutes = 24 * 60 + minutes - 45;
        }
        return String.join(" ", String.valueOf(minutes / 60), String.valueOf(minutes % 60));
    }

    private static int timeToMinutes(int hour, int minute) {
        return hour * 60 + minute;
    }
}
