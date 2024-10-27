package study.hash.hash03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (right = k - 1; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            result.add(map.size());
            map.put(arr[left], map.get(arr[left])-1);
            if (map.get(arr[left]) == 0) {
                map.remove(arr[left]);
            }
            left++;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        T.solution(n, k, arr).forEach((x) -> System.out.print(x + " "));
    }
}
