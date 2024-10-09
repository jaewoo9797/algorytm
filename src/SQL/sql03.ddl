-- 정답
SELECT COUNT(id) AS FISH_COUNT
FROM FISH_INFO
WHERE IFNULL(LENGTH, 10) <= 10;

SELECT COUNT(id) AS FISH_COUNT
FROM FISH_INFO
WHERE LENGTH IS NULL;

문제
잡은 물고기 중 길이가 10cm 이하인 물고기의 수를 출력하는 SQL 문을 작성해주세요.

물고기의 수를 나타내는 컬럼 명은 FISH_COUNT로 해주세요.

예시
예를 들어 FISH_INFO 테이블이 다음과 같다면

ID	FISH_TYPE	LENGTH	TIME
0	0	13.37	2021/12/04
1	0	50	2020/03/07
2	0	40	2020/03/07
3	1	43.33	2022/03/09
4	1	NULL	2022/04/08
5	2	NULL	2020/04/28
물고기 ID가 4, 5인 물고기들의 길이가 NULL, 즉 10cm 이하이므로 총 2마리 입니다. 따라서 결과는 다음과 같습니다.

FISH_COUNT
2


