package study.sort.sort08.이진;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static int solution(int length, int target, int[] arr) {
        var array = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Collections.reverseOrder());
        for (Integer x : array) {
            System.out.print(x + " ");
        }
        return Arrays.binarySearch(arr, target) + 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        var n = Integer.parseInt(st.nextToken());
        var m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution(n, m, arr));
    }
}
