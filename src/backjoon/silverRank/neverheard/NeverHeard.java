package backjoon.silverRank.neverheard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class NeverHeard {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> noHeard = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            noHeard.add(br.readLine());
        }

        List<String> answer = new ArrayList<String>();
        for (int i = 0; i < m; i++) {
            var noSeen = br.readLine();
            if (noHeard.contains(noSeen)) {
                answer.add(noSeen);
            }
        }
        Collections.sort(answer);

        StringBuilder sb = new StringBuilder();
        bw.write(answer.size() + "\n");
        answer.forEach(s -> sb.append(s).append("\n"));

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
