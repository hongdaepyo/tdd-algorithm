package com.dphong.problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 */
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
        assertEquals(1, prob.solve(2));
        assertEquals(2, prob.solve(3));
        assertEquals(3, prob.solve(4));
        assertEquals(5, prob.solve(5));
        assertEquals(8, prob.solve(6));
        assertEquals(13, prob.solve(7));
        assertEquals(21, prob.solve(8));
    }
}
