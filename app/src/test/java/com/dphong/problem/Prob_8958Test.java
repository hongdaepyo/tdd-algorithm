package com.dphong.problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Prob_8958Test {
    @Test
    void solve() {
        assertEquals(10, Prob_8958.solve("OOXXOXXOOO"));
        assertEquals(9, Prob_8958.solve("OOXXOOXXOO"));
//        assertEquals(7, Prob_8958.solve("OXOXOXOXOXOXOX"));
//        assertEquals(55, Prob_8958.solve("OOOOOOOOOO"));
//        assertEquals(30, Prob_8958.solve("OOOOXOOOOXOOOOX"));
    }
}
