package backjoon.silverRank.cabbage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CabbageRe {
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};
    private static boolean[][] isVisited;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());    // test case

            StringTokenizer st;
            while (T-- > 0) {
                st = new StringTokenizer(br.readLine());
                int M = Integer.parseInt(st.nextToken());   // 가로길이
                int N = Integer.parseInt(st.nextToken());   // 세로 길이
                int K = Integer.parseInt(st.nextToken());   // 심어진 배추 개수
                int[][] array = new int[N][M];
                isVisited = new boolean[N][M];
                for (int j = 0; j < K; j++) {
                    st = new StringTokenizer(br.readLine());
                    int X = Integer.parseInt(st.nextToken());
                    int Y = Integer.parseInt(st.nextToken());
                    array[Y][X] = 1;
                }

                var count = calculateCount(array);
                System.out.println(count);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static int calculateCount(int[][] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1 && !isVisited[i][j]) {
                    dfs(i, j, array);
                    count++;
                }
            }
        }

        return count;
    }

    private static void dfs(int y, int x, int[][] array) {
        isVisited[y][x] = true;

        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny >= 0 && nx >= 0 && ny < array.length && nx < array[0].length) {
                if (array[ny][nx] == 1 && !isVisited[ny][nx]) {
                    dfs(ny, nx, array);
                }
            }
        }
    }
}
