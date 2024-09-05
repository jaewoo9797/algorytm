package String07;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
/*        // 입력받은 문자열을 대 소문자 통일
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
        return "YES";*/

        /*
        * 강의에서 푼 방식
        * */
//        str = str.toUpperCase();
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";
//        int len = str.length();
//        for(int i=0;i<len/2;i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                answer = "NO";
//                return answer;
//            }
//        }

        return answer;


/*        String answer = "NO";

        // 대소문자 통일
        str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";

        return answer;*/
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(T.solution(s));
    }
}
