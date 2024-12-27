package backjoon.silverRank.emptyset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmptySet {

    private static final Set<Integer> set = new HashSet<Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            var s = inputLine(br.readLine());
            sb.append(s);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static String inputLine(String line) {
        var split = line.split(" ");
        switch (split[0]) {
            case "add":
                add(Integer.parseInt(split[1]));
                return "";

            case "remove":
                remove(Integer.parseInt(split[1]));
                return "";

            case "check":
                return check(Integer.parseInt(split[1])) + "\n";
            case "toggle":
                toggle(Integer.parseInt(split[1]));
                return "";
            case "all":
                all();

            case "empty":
                empty();
                return "";
            default:
                return "";
        }
    }

    private static void empty() {
        set.clear();
    }

    private static void all() {
        empty();
        set.addAll(IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.toSet()));
    }

    private static void toggle(int i) {
        if (set.contains(i)) {
            set.remove(i);
        } else {
            set.add(i);
        }
    }

    private static String check(int i) {
        if (set.contains(i)) {
            return "1";
        }
        return "0";
    }

    private static void remove(int i) {
        set.remove(i);
    }

    private static void add(int n) {
        set.add(n);
    }
}
