package pointer.po08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public String solution(String n, String m) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : n.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x: m.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0 ) return "NO";
            map.put(x, map.get(x) -1);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String m = br.readLine();
        System.out.println(T.solution(n, m));
    }
}
