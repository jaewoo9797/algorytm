package study.stackpractice.스택11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    class Person {
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> que = new LinkedList<>();
        for (int i : arr) {
            que.offer(new Person(i, arr[i]));
        }
        while (!que.isEmpty()) {
            Person temp = que.poll();
            for (Person p : que) {
                if (p.priority > temp.priority) {
                    que.offer(temp);
                    temp = null;
                    break;
                }
            }
            if (temp != null) {
                answer++;
                if (temp.id == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main app = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(app.solution(n, m, arr));
    }
}
