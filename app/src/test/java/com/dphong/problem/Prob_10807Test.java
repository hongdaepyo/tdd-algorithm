package com.dphong.problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Prob_10807Test {

    private Prob_10807 prob;

    @BeforeEach
    void setUp() {
        prob = new Prob_10807();
    }

    @Test
    void create() {
        assertNotNull(prob);
    }

    @Test
    void solve() {
        assertEquals(0, prob.solve(0));
        assertEquals(1, prob.solve(1));
//        assertEquals(0, prob.solve(0));
//        assertEquals(0, prob.solve(0));
    }
}
