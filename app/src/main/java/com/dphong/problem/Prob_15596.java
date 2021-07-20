package com.dphong.problem;

public class Prob_15596 {
    public long sum(int[] a) {
        long ans = 0;

        for (int i : a) {
            ans += i;
        }

        return ans;
    }
}
