package backjoon.silverRank.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class StackProgression {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        var solution = solution(n, array);
        bw.write(solution);
        bw.flush();
        bw.close();

    }

    private static String solution(int n, int[] array) {
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        StringBuilder sb = new StringBuilder();
        for (int x : array) {
            if (x > current) {
                for (int i = current + 1; i <= x; i++) {
                    stack.push(i);
                    sb.append("+").append("\n");
                }
                current = x;
            } else if (stack.peek() != x) {
                return "NO";
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        return sb.toString();
    }
}
