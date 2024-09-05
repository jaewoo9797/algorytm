package String.String10;

import java.util.Scanner;

public class Main {
/*    public String solution(String str, String e) {
        String answer = "";
        char[] arr = str.toCharArray();
        int len = arr.length;
        int[] intarr = new int[len];
        int p = 1000;
        for(int i=0;i<len;i++) {
            if(String.valueOf(arr[i]).equals(e)) {
                p=0;
                intarr[i]=p;
                p++;
            } else {
                intarr[i] = p;
                p++;
            }
        }

        for(int x : intarr) {
            answer+=x+" ";
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        System.out.println(T.solution(arr[0], arr[1]));
    }*/


    /*
    * 강의에서 푼 방식
    * */
    public int[] solution(String s, char t) {
        int[] answer=new int[s.length()];
        int p = 1000;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)==t) {
                p=0;
                answer[i]=p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i)==t) p=0;
            else {
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T =new Main();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char c = sc.next().charAt(0);
        for(int x : T.solution(str,c)) {
            System.out.print(x+" ");
        }
    }
}
