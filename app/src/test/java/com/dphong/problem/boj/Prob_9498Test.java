package com.dphong.problem.boj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob_9498Test {
    private Prob_9498 prob = new Prob_9498();

    @Test
    void prob() {
        assertEquals("A", prob.solve(100));
        assertEquals("B", prob.solve(88));
        assertEquals("C", prob.solve(77));
        assertEquals("D", prob.solve(66));
        assertEquals("F", prob.solve(55));
        assertEquals("A", prob.solve(90));
        assertEquals("B", prob.solve(80));
        assertEquals("C", prob.solve(70));
        assertEquals("D", prob.solve(60));
    }
}
