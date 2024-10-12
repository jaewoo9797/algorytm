-- 특정 옵션이 포함된 자동차 리스트 구하기
-- CAR_RENTAL_COMPANY_CAR 테이블
-- CAR_ID, CAR_TYPE, DAILY_FEE, OPTIONS
-- 자동차 ID, 자동차 종료, 일일 대여 요금(원), 자동차 옵션 리스트

-- 문제
-- CAR_RENTAL_COMPANY_CAR 테이블에서 '네비게이션' 옵션이 포함된 자동차 리스트를 출력하는 SQL문을 작성해주세요. 결과는 자동차 ID를 기준으로 내림차순 정렬해주세요.

-- 콤마(,)를 구분자로 OPIONTS 분리하기
SELECT CAR_ID, CAR_TYPE, DAILY_FEE, OPTIONS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%네비게이션%'
ORDER BY CAR_ID DESC;


-- 콤마(,)를 구분자로 OPIONTS 분리하기
SELECT CAR_ID, CAR_TYPE, DAILY_FEE, OPTIONS
FROM CAR_RENTAL_COMPANY_CAR
WHERE FIND_IN_SET('네비게이션', OPTIONS) >0
ORDER BY CAR_ID DESC;
-- FIND_IN_SET를 활용한 방식
-- 만약 옵션이 문자열로 구분되어 저장되어 있는 경우
-- (옵션1,옵션2,옵션3 같은 형태로), FIND_IN_SET 함수를 사용할 수 있습니다.
-- https://www.w3schools.com/mysql/func_mysql_find_in_set.asp
Return Values
If string is not found in string_list, this function returns 0
If string or string_list is NULL, this function returns NULL
If string_list is an empty string (""), this function returns 0