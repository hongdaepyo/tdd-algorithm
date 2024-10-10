package com.dphong.problem.boj;

public class Prob_15596 {
    public long sum(int[] a) {
        long ans = 0;

        for (int i : a) {
            ans += i;
        }

        return ans;
    }
}
