package com.dphong.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Prob_10818Test {
    @Test
    void solve() {
        String[] nums = "20 10 35 30 7".split(" ");
        assertEquals("7 35", Prob_10818.solve(nums));

        assertEquals("1 1", Prob_10818.solve(new String[]{"1"}));
    }

    @Test
    void solve_test_2() {
        String[] nums = "1 2 3 4 5".split(" ");
        assertEquals("1 5", Prob_10818.solve(nums));
    }

    @Test
    void solve_minus() {
        String[] nums = "-1 -2 -3 -4 -5".split(" ");
        assertEquals("-5 -1", Prob_10818.solve(nums));

        String[] nums2 = "-1000000 1000000".split(" ");
        assertEquals("-1000000 1000000", Prob_10818.solve(nums2));
    }
}
