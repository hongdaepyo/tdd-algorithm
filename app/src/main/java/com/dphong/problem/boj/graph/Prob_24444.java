package com.dphong.problem.boj.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Prob_24444 {

    static int count;
    static int[] checked;
    static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점의 수
        int M = Integer.parseInt(st.nextToken()); // 간선의 수
        int R = Integer.parseInt(st.nextToken()); // 시작 정점
        checked = new int[N + 1];

        // graph 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 양방향 간선 graph 구성
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        count = 1;
        bfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < checked.length; i++) {
            sb.append(checked[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void bfs(int node) {
        checked[node] = count++;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        
        while(!queue.isEmpty()) {
            int n = queue.poll();

            for (int i = 0; i < graph.get(n).size(); i++) {
                int nextV = graph.get(n).get(i);
                if (checked[nextV] == 0) {
                    queue.offer(nextV);
                    checked[nextV] = count++;
                }
            }
        }
    }
}
