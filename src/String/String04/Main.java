package String.String04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /* 내가 푼 로직
    static String solution( String str) {
        String answer = "";
        // 입력받은 문자열 뒤집기
        String[] arr = str.split("");
        for(int i=arr.length-1; i>=0; i--) {
            answer += arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=1; i<=n; i++) {
            arr[i-1] = solution(sc.next());
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
        */
     // 다른 방법
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        /* StringBuilder를 이용한 방법
       for(String x : str) {
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);
        }*/
        // index를 이용한 방법 lt rt
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt=0, rt=x.length()-1;
            while(lt<rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

/*    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for(String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }*/

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i<n; i++) {
            arr[i] = br.readLine();
        }
        T.solution2(n, arr).forEach(System.out::println);
    }

    public ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        int lt, rt;
        for (String x : str) {
            lt = 0; rt = x.length()-1;
            char[] arr = x.toCharArray();
            while (lt < rt) {
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(arr));
        }
        return answer;
    }
}
