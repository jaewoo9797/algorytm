package queue.que01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public String solution(String required, String subject) {
        String answer = "YES";
        Queue<Character> rq = new LinkedList<>();   // 필수 요소
        for (char x : required.toCharArray()) {
            rq.add(x);
        }
        for (char x : subject.toCharArray()) {
            if(rq.contains(x) && rq.peek() == x) {
                rq.poll();
            }
        }
        // 모든 과목을 순회 후에 큐에 요소가 남아있다면 NO 리턴
        if (!rq.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String required = br.readLine();
        String subject = br.readLine();
        System.out.println(T.solution(required, subject));
    }
}
