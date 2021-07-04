package com.dphong.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob_14681Test {
    private final Prob_14681 prob = new Prob_14681();

    @Test
    void solve() {
        assertEquals(1, prob.solve(12, 5));
        assertEquals(4, prob.solve(9, -13));
        assertEquals(3, prob.solve(-1000, -1000));
        assertEquals(2, prob.solve(-1000, 1000));
        assertEquals(1, prob.solve(1000, 1000));
        assertEquals(4, prob.solve(1000, -1000));
    }
}