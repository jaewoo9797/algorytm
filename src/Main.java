import java.util.*;

public class Main {
    static class Team {
        int number;  // 팀 번호
        int Pi;      // 온라인 투표 점수
        int Ji;      // 심사위원 점수
        int totalScore;  // 총점: Pi + 2 * Ji

        // 생성자
        Team(int number, int Pi, int Ji) {
            this.number = number;
            this.Pi = Pi;
            this.Ji = Ji;
            this.totalScore = Pi + 2 * Ji;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력값 읽기
        int N = sc.nextInt();  // 팀의 수
        int K = sc.nextInt();  // 특별상을 받을 등수

        // 팀 객체를 저장할 리스트
        List<Team> teams = new ArrayList<>();

        // 팀 점수를 읽고 팀 객체 생성
        for (int i = 1; i <= N; i++) {
            int Pi = sc.nextInt();  // 온라인 투표 점수
            int Ji = sc.nextInt();  // 심사위원 점수
            teams.add(new Team(i, Pi, Ji));
        }

        // 총점 내림차순, Pi 내림차순으로 팀 정렬
        teams.sort((a, b) -> {
            if (b.totalScore != a.totalScore) {
                return b.totalScore - a.totalScore;  // 총점 기준 내림차순 정렬
            } else {
                return b.Pi - a.Pi;  // 총점이 같을 경우, Pi 기준 내림차순 정렬
            }
        });

        // K등에 해당하는 팀의 번호 찾기
        int result = teams.get(K - 1).number;

        // 결과 출력
        System.out.println(result);

        sc.close();
    }
}