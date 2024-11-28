package study.stackpractice.스택05;

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
    }
    public int solution(String str) {
        Stack<Integer> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                int num2 = stack.pop();
                int num1 = stack.pop();
                stack.push(chooseOperation(c, num1, num2));
            } else {
                stack.push(Character.getNumericValue(c));
            }
        }
        System.out.println(stack);
        return stack.getLast();
    }

    public static void main(String[] args) throws IOException {
        Main app = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(app.solution(input));
    }
}
