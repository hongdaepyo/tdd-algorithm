package com.dphong.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob_2753Test {
    private Prob_2753 prob = new Prob_2753();

    @Test
    void solve() {
        assertEquals(1, prob.solve(2000));
        assertEquals(0, prob.solve(1999));
        assertEquals(0, prob.solve(1998));
        assertEquals(0, prob.solve(1900));
        assertEquals(0, prob.solve(1));
        assertEquals(1, prob.solve(800));
        assertEquals(1, prob.solve(4000));
        assertEquals(1, prob.solve(400));
        assertEquals(0, prob.solve(200));
        assertEquals(0, prob.solve(300));
        assertEquals(1, prob.solve(2012));
    }
}
