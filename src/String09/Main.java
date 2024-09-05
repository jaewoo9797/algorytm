package String09;

import java.util.Scanner;

public class Main {
    public int solution(String str) {
/*        String answer = str.replaceAll("[A-z]","");
        return Integer.parseInt(answer);*/


        /*
        * 강의에서 푼 방식
        * */
        int answer = 0;

        char[] arr = str.toCharArray();
        for (char x : arr) {
            if (x>= 48 && x <=57) {
                answer = answer*10+(x-48);
            }
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
