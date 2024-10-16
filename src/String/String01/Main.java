package String.String01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public int solution(String str, String target) {
        int answer = 0;
        for (char x : str.toLowerCase().toCharArray()) {
            if (x == target.charAt(0)) answer++;
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String target = br.readLine();
        System.out.println(T.solution(str, target));
    }
}
