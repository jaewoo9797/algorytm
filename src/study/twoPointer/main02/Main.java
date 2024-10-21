package study.twoPointer.main02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static ArrayList<Integer> solution(int n, int[] arrN, int m, int[] arrM){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arrN);
        Arrays.sort(arrM);

        int i=0, j =0;
        while (i < n && j < m) {
            if (arrN[i] == arrM[j]) {
                answer.add(arrN[i]);
                i++;
                j++;
            } else if (arrN[i] > arrM[j]) {
                j++;
            } else if (arrN[i] < arrM[j]) {
                i++;
            }
        }

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
