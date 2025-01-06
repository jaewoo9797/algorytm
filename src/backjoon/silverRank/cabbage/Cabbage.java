package backjoon.silverRank.cabbage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Cabbage {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());    // 테스트 케이스의 개수

        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            // 배추 밭의 가로 세로 길이 입력 받기
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()); // 배추밭의 가로 길이
            int N = Integer.parseInt(st.nextToken());   // 배추밭의 세로 길이

            int[][] cabbage = new int[N][M];

            int k = Integer.parseInt(st.nextToken());    // 배추가 심어져 있는 개수
            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                cabbage[y][x] = 1;
            }

            int result = calculateCount(cabbage);
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }

    static int calculateCount(int[][] cabbage) {
        int count = 0;
        boolean[][] visited = new boolean[cabbage.length][cabbage[0].length];

        for (int i = 0; i < cabbage.length; i++) {
            for (int j = 0; j < cabbage[i].length; j++) {
                if (cabbage[i][j] == 1 && !visited[i][j]) {
                    bfs(j, i, cabbage, visited);
                    count++;
                }
            }
        }
        return count;
    }

    static void bfs(int x, int y, int[][] cabbage, boolean[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[y][x] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int cx = current[0];
            int cy = current[1];

            // 상하 좌우 탐색
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                // 배열 범위 내 && 배추가 심어져 있고 && 방문하지 않은 경우
                if (nx >= 0 && ny >= 0 && nx < cabbage[0].length && ny < cabbage.length) {
                    if (cabbage[ny][nx] == 1 && !visited[ny][nx]) {
                        visited[ny][nx] = true;
                        q.add(new int[]{nx, ny});
                    }
                }
            }

        }
    }
}

/**
 * BFS 로 문제 풀기
 * 1. 모든 배열을 순회하면서 노드를 검사한다.
 * 2. 한 노드에서 근접한 다른 노드와의 연결을 확인하고, 방문했음을 체크한다. 한 노드에서 근접한 노드를 방문하여 flag를 바꿔준다
 * 3. 모든 방문한 노드 군집의 개수를 더한다.
 */