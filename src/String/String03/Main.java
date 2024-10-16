package String.String03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static String solution(String str) {
        /*  1. 내가 직접 푼 로직
       String result = "";
         입력받은 문자열(문장)에서 공백을 기준으로 배열로 만든다.
        String[] arr = str.split(" ");
         만들어진 배열에서 가장 길이가 긴 문자열을 반환해준다.
        for(String a : arr) {
            if(a.length() > result.length()) {
                if(a.length() == result.length()) continue;
                result = a;
            }
        }
        */

        /*  2. 최댓값 갱신하여 결과값 반환
        String answer = "";
        int m=Integer.MIN_VALUE;
        for(String x : str.split(" ")) {
            if(x.length() > m ) {
                m = x.length();
                answer = x;
            }
        }
        return answer;
        */

        /*
        3. indexOf 이용해서 결과 리턴
        * */
        String answer ="";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!= -1){
            String temp = str.substring(0, pos);
            int len = temp.length();
            if(len>m) {
                m=len;
                answer=temp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m) answer=str;  // 마지막 단어가 반복문에 들어가지 않기 때문에 마지막에 꼭 처리해주어야 한다.
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution2(str));
    }

    public String solution2(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()) {
            String tk = st.nextToken();
            if(tk.length() > max) {
                max = tk.length();
                answer = tk;
            }
        }
        return answer;
    }
}
