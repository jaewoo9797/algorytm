package study.sort.sort09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int count(int[] arr, int capacity) {
        int sum = 0, count = 1;
        for (int x : arr) {
            if (x + sum > capacity) {
                count++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return count;
    }
    public static int solution(int number, int cdNumber, int[] arr) {
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int answer = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= cdNumber) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
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
