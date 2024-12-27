package backjoon.silverRank.pokemonmaster;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PokemonMaster {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 도감에 수록되어 있는 포켓몬의 개수
        int M = Integer.parseInt(st.nextToken());   // 맞추어야 하는 문제의 수

        String[] pokemonArray = new String[N];  // 도감 수록 포켓몬
        for (int i = 0; i < N; i++) {
            pokemonArray[i] = br.readLine();
        }

        String[] problemsArray = new String[M];
        for (int i = 0; i < M; i++) {   // 문제 배열
            problemsArray[i] = br.readLine();
        }

        var matchedPokemon = matchPokemon(pokemonArray, problemsArray);
        bw.write(matchedPokemon + "\n");
        bw.flush();
        bw.close();
    }

    private static String matchPokemon(String[] pokemonArray, String[] problemsArray) {
        StringBuilder sb = new StringBuilder();
        var guideBookNumber = initByNumber(pokemonArray);
        var guideBookName = initByName(pokemonArray);
        for (String target : problemsArray) {
            if (Character.isDigit(target.charAt(0))) {
                // 숫자일 경우
                sb.append(guideBookNumber.get(Integer.parseInt(target))).append("\n");
            } else {
                // 문자일 경우
                sb.append(guideBookName.get(target).toString()).append("\n");
            }
        }

        return sb.toString();
    }

    private static Map<String, Integer> initByName(String[] pokemonArray) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < pokemonArray.length; i++) {
            map.put(pokemonArray[i], i + 1);
        }
        return map;
    }

    private static Map<Integer, String> initByNumber(String[] pokemonArray) {
        Map<Integer, String> guideBook = new HashMap<>();
        for (int i = 0; i < pokemonArray.length; i++) {
            guideBook.put(i + 1, pokemonArray[i]);
        }
        return guideBook;
    }

}
