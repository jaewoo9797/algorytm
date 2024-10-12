문제
CAR_RENTAL_COMPANY_CAR 테이블에서 자동차 종류가 'SUV'인 자동차들의 평균 일일 대여 요금을 출력하는 SQL문을 작성해주세요.
이때 평균 일일 대여 요금은 소수 첫 번째 자리에서 반올림하고, 컬럼명은 AVERAGE_FEE 로 지정해주세요.

예시
예를 들어 CAR_RENTAL_COMPANY_CAR 테이블이 다음과 같다면

CAR_ID	CAR_TYPE	DAILY_FEE	OPTIONS
1	세단	16000	가죽시트,열선시트,후방카메라
2	SUV	14000	스마트키,네비게이션,열선시트
3	SUV	22000	주차감지센서,후방카메라,가죽시트
'SUV' 에 해당하는 자동차들의 평균 일일 대여 요금은 18,000 원 이므로, 다음과 같은 결과가 나와야 합니다.

AVERAGE_FEE
18000

SELECT ROUND(AVG(DAILY_FEE)) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
GROUP BY CAR_TYPE
HAVING CAR_TYPE = 'SUV'