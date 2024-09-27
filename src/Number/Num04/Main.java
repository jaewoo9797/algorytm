package Number.Num04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public ArrayList<Integer> solution(int N) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(1);
        answer.add(1);
        for (int i = 2; i < N; i++) {
            answer.add(answer.get(i-2) + answer.get(i-1));
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        T.solution(N).forEach((x) -> System.out.print(x + " "));
    }
}
