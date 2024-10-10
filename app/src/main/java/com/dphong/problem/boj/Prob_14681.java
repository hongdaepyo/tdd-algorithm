package com.dphong.problem.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Prob_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        System.out.println(solve(x, y));
    }

    public static int solve(int x, int y) {
        return Quadrant.of(x, y).number;
    }

    private enum Quadrant {
        Q1(1) {
            @Override
            public boolean range(int x, int y) {
                return x > 0 && y > 0;
            }
        },
        Q2(2) {
            @Override
            public boolean range(int x, int y) {
                return x < 0 && y > 0;
            }
        },
        Q3(3) {
            @Override
            public boolean range(int x, int y) {
                return x < 0 && y < 0;
            }
        },
        Q4(4) {
            @Override
            public boolean range(int x, int y) {
                return x > 0 && y < 0;
            }
        };

        private int number;

        Quadrant(int number) {
            this.number = number;
        }

        public abstract boolean range(int x, int y);

        public static Quadrant of(int x, int y) {
            return Arrays.stream(Quadrant.values())
                    .filter(it -> it.range(x, y))
                    .findFirst()
                    .get();
        }
    }
}
