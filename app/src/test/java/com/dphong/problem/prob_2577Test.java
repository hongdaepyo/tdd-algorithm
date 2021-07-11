package com.dphong.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class prob_2577Test {
    @Test
    void solve() {
        String solution = "3\n1\n0\n2\n0\n0\n0\n2\n0\n0\n";
        String result = Prob_2577.solve(150, 266, 427);
        assertEquals(solution, result);
    }
}