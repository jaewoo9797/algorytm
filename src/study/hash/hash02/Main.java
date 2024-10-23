package study.hash.hash02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public String solution(String str1, String str2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) +1);
        }
        for (char x : str2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x)-1);
        }
        for (char x : map.keySet()) {
            System.out.println(x + " " + map.get(x));
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        T.solution(str1, str2);
    }
}
