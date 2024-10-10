package com.dphong.problem.boj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob_2884Test {

    Prob_2884 prob = new Prob_2884();

    @Test
    void solve() {
        assertEquals("9 25", prob.solve("10 10"));
        assertEquals("23 45", prob.solve("0 30"));
        assertEquals("22 55", prob.solve("23 40"));
        assertEquals("23 15", prob.solve("0 0"));
        assertEquals("23 14", prob.solve("23 59"));
        assertEquals("0 0", prob.solve("0 45"));
    }
}
