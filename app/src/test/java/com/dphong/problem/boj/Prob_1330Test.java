package com.dphong.problem.boj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
    1 2, 10 2, 5 5
*/
class Prob_1330Test {
    Prob_1330 prob = new Prob_1330();

    @Test
    void prob() throws Exception {
        assertEquals("<", prob.solve("1 2"));
        assertEquals(">", prob.solve("10 2"));
        assertEquals("==", prob.solve("5 5"));
        assertEquals(">", prob.solve("-5 -6"));
        assertEquals("==", prob.solve("-10000 -10000"));
        assertEquals(">", prob.solve("10000 -10000"));
    }
}
