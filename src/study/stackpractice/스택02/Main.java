package study.stackpractice.스택02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static List<Character> solution(String input) {
        ArrayList<Character> list = new ArrayList<Character>();
        Stack<Character> stack = new Stack<Character>();

        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            } else if (stack.isEmpty()){
                list.add(c);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solution(sc.nextLine()).forEach(System.out::print);
    }
}
