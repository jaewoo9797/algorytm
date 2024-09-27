package String.String12;

import java.util.Scanner;

public class Main {
    public String solution(int n, String str) {
        String answer = "";
        // str을 7개씩 잘라서 검사
        for(int i=0; i<n; i++) {
            String temp = str.substring(0,7).replace('#', '1').replace('*','0');
            int num = Integer.parseInt(temp, 2);
            answer += (char)num;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        // 첫 줄 보낸 문자의 개수
        int n = sc.nextInt();
        // 다음 줄 특수문자 (n번 만큼 반복)
        String str = sc.next();
        System.out.println(T.solution(n,str));
    }
}
