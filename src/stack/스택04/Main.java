package stack.스택04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public int chooseOperation(char c, int a, int b) {
        return switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
        /*  자바 12 버전 이하를 사용할 경우 switch 표현식이  컴파일 에러가 난다.
                switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
        * */
    }

    public int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '+' || c == '-' || c == '*'  || c =='/') {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(chooseOperation(c,a,b));
            } else {
                stack.push(Character.getNumericValue(c));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
