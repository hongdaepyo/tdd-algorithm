package com.dphong.problem;

public class Prob_10807 {
    public int solve(int n) {
        if (n <= 1) {
            return n;
        }
        if (n > 1) {
            return solve(n - 1) + solve(n - 2);
        }
        return 0;
    }
}
