package stack.스택05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public int solution(String str) {
        int answer =  0;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            // 여는 괄호인 경우 push
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }
            // 레이저인 경우
            else if (str.charAt(i) == ')' && str.charAt(i-1) == '(') {
                stack.pop();
                answer += stack.size();
            }
            // 막대기 끝점인 경우
            else {
                stack.pop();
                answer += 1;
            }

        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T =  new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}


