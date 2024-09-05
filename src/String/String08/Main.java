package String.String08;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
//        char[] arr = str.toUpperCase().toCharArray();
//        int lt=0, rt= arr.length-1;
//        while(lt<rt) {
//            if(!Character.isLetter(arr[lt])) {  //lt가 가리키는 곳이 문자열이 아닐 경우
//                lt++;
//            } else if(!Character.isLetter(arr[rt])) {   //rt가 가리키는 곳이 문자열이 아닐 경우
//                rt--;
//            } else {    //팰린드롬 문자열이 아닐 경우
//                if(arr[lt] != arr[rt]) return "NO";
//                lt++;
//                rt--;
//            }
//        }
//
//        return "YES";

        /*
        *   강의에서 문제 푼 방식
        * */
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(T.solution(s));
    }
}
