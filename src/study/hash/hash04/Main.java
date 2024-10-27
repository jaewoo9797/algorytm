package study.hash.hash04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public int solution(String s, String t) {
        int result = 0;
        HashMap<Character, Integer> tm = new HashMap<>();
        HashMap<Character, Integer> sm = new HashMap<>();
        for (char c : t.toCharArray()) {
            tm.put(c, tm.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        for (int i = 0; i < t.length()-1; i++) {
            sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0) +1);
        }
        for (int right = t.length()-1; right < s.length(); right++) {
            sm.put(s.charAt(right), sm.getOrDefault(s.charAt(right), 0) +1);
            if (sm.equals(tm)) {
                result++;
            }
            sm.put(s.charAt(left), sm.get(s.charAt(left)) -1);
            if (sm.get(s.charAt(left)) == 0) {
                sm.remove(s.charAt(left));
            }
            left++;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        System.out.println(T.solution(s, t));
    }
}
