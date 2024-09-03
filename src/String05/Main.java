package String05;

import java.util.Scanner;

public class Main {
    public String solution(String str) {

        char[] ch = str.toCharArray();
        int lt=0;
        int rt=ch.length-1;
        while(lt<rt) {

            if(!Character.isLetter(ch[lt]) ) {    // 문자가 아닐 경우 다음 반복문으로 이동
                lt++;
            }else if (!Character.isLetter(ch[rt])){
                rt--;
            }else {
                char tmp = ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
