package study.stackpractice.스택10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static String solution(String str1, String str2) {
        String answer = "YES";
        Queue<Character> que = new LinkedList<>();
        for (char c : str1.toCharArray()) {
            que.offer(c);
        }

        for (char c : str2.toCharArray()) {
            if (!que.isEmpty() && que.peek() == c) {
                que.poll();
            }
        }
        if (!que.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        System.out.println(solution(str1, str2));
    }
}
