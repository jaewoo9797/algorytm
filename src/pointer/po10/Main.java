package pointer.po10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public int solution(String s, String t) {
        int answer = 0;
        // t 문자열 map
        HashMap<Character, Integer> tm = new HashMap<>();
        HashMap<Character, Integer> am = new HashMap<>();
        for (char x : t.toCharArray()) {
            tm.put(x, tm.getOrDefault(x, 0) +1) ;
        }
        for (int i = 0; i< t.length()-1; i++) { // am에 t-1 길이만큼 문자를 넣어둠
            am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = t.length()-1; rt < s.length(); rt++) {
            am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt), 0) + 1);
            if (tm.equals(am)) answer++;
            am.put(s.charAt(lt), am.get(s.charAt(lt)) -1);
            if (am.get(s.charAt(lt)) == 0) am.remove(s.charAt(lt));
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        T.solution(s, t);
        System.out.println(T.solution(s, t));
    }
}