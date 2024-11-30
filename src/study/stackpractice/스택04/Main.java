package study.stackpractice.스택04;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // 충분히 많은 키-값 쌍을 추가
        for (int i = 0; i < 100; i++) {
            map.put("key" + i, i);
        }

        // 여러 번 출력하여 순서 확인
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration " + (i + 1) + ":");
            map.keySet().forEach(System.out::println);
            System.out.println();
        }

    }
}
