package backjoon.silverRank.makecoloredpaper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeColoredPaper {
    static int blueColor = 0;
    static int whiteColor = 0;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divideAndConquer(0, 0, n);

        System.out.println(whiteColor);
        System.out.println(blueColor);
    }

    private static void divideAndConquer(int x, int y, int size) {
        if (isSameColor(x, y, size)) {
            if (arr[x][y] == 0) {
                whiteColor++;
            } else {
                blueColor++;
            }
            return;
        }
        int newSize = size / 2;
        divideAndConquer(x, y, newSize);
        divideAndConquer(x, y + newSize, newSize);
        divideAndConquer(x + newSize, y, newSize);
        divideAndConquer(x + newSize, y + newSize, newSize);
    }

    private static boolean isSameColor(int x, int y, int size) {
        int color = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}
