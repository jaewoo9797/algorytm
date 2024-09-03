package String07;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        // 입력받은 문자열을 대 소문자 통일
        String s = str.toLowerCase();
        char[] arr = s.toCharArray();
        // 문자열이 회문 문자열인지 검사
        int lt=0, rt=arr.length-1;
        while(lt<rt) {
            if(arr[lt]!=arr[rt]) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return "YES";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(T.solution(s));
    }
}
