package backjoon.silverRank.findPassword;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class FindPassword {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int savedSiteSize = Integer.parseInt(st.nextToken());
        int findSiteSize = Integer.parseInt(st.nextToken());

        String[] saved = new String[savedSiteSize];
        for (int i = 0; i < savedSiteSize; i++) {
            saved[i] = br.readLine();
        }

        String[] find = new String[findSiteSize];
        for (int i = 0; i < findSiteSize; i++) {
            find[i] = br.readLine();
        }

        var findPassword = findPassword(saved, find);

        bw.write(findPassword + "\n");
        bw.flush();
        bw.close();
    }

    private static String findPassword(String[] saved, String[] find) {
        StringBuilder sb = new StringBuilder();

        var savedPasswords = initSaved(saved);
        var findPasswords = passwordByString(savedPasswords, find);

        findPasswords
                .forEach(password -> sb.append(password).append("\n"));
        return sb.toString().trim();
    }

    private static Map<String, String> initSaved(String[] saved) {
        Map<String, String> map = new HashMap<>();
        for (String line : saved) {
            var splitLine = line.split(" ");
            map.put(splitLine[0], splitLine[1]);
        }
        return map;
    }

    private static List<String> passwordByString(Map<String, String> savedPasswords, String[] finds) {
        return Arrays.stream(finds)
                .map(savedPasswords::get)
                .collect(Collectors.toList());
    }
}
