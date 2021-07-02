package com.dphong.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob_9498Test {
    private Prob_9498 prob = new Prob_9498();

    @Test
    void prob() {
        assertEquals("A", prob.solve(100));
        assertEquals("B", prob.solve(88));
//        assertEquals("A", prob.solve(100));
    }
}
