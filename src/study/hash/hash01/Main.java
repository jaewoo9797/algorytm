package study.hash.hash01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public Character solution(int n, String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char answer = ' ';
        int cnt = Integer.MIN_VALUE;
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char x : map.keySet()) {
            System.out.println(" key : " + x + " , value : " + map.get(x));
            if (map.get(x) > cnt) {
                cnt = map.get(x);
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        System.out.println(T.solution(n, str));
    }
}
