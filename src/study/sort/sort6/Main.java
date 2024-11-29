package study.sort.sort6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> result = new ArrayList<>();
        int[] temp = arr.clone();
        Arrays.sort(temp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != temp[i]) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, arr)
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "))
        );
    }
}
