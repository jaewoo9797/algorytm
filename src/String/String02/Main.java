package String.String02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        for (char x : str.toCharArray()) {
            if (Character.isUpperCase(x)) answer.append(Character.toLowerCase(x));
            else answer.append(Character.toUpperCase(x));
        }
        return answer.toString();
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
