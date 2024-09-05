package String.String06;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
/*        StringBuilder answer = new StringBuilder();
        // 문자열을 문자배열로 변환
        char[] arr = str.toCharArray();
        int len = arr.length;
        // 문자 배열 길이만큼 반복하며 answer에 더하기
        for(int i=0; i<len; i++) {
            if(answer.indexOf(String.valueOf(arr[i])) == -1) {
                answer.append(arr[i]);
            }
        }
        return answer.toString();*/

        /*
        * 강의에서 푼 방식
        * */
        String answer = "";

        for(int i=0; i<str.length(); i++) {
//          System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
