package queue.que02;

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

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<Person>();
        for (int i=0; i<n; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while(!queue.isEmpty()) {
            Person temp = queue.poll();
            for (Person p : queue) {
                if(p.priority > temp.priority) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if (temp != null) {
                answer++;
                if (k == temp.id) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(n,k,arr));
    }
}
