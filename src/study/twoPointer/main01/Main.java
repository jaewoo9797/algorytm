package study.twoPointer.main01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static ArrayList<Integer> solution(int n, int[] arrN, int m, int[] arrM) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 각 배열 인덱스 선언
        int idxN = 0, idxM = 0;
        while (idxN < n && idxM < m) {
            if (arrN[idxN] > arrM[idxM]) answer.add(arrM[idxM++]);
            else answer.add(arrN[idxN++]);
        }
        while (idxN < n) answer.add(arrN[idxN++]);
        while (idxM < m) answer.add(arrM[idxM++]);
        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrN = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arrM = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }
        solution(n, arrN, m, arrM).forEach((x) -> System.out.print(x + " "));
    }
}
