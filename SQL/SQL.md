`SQL`은 관계형 데이터베이스 관리시스템의 데이터를 관리하기 위해 설계된 특수목적의 프로그래밍 언어

`DDL (Data Definition Language) : 데이터를 정의`

- CREATE : 테이블 생성

- ALTER : 테이블 구조 변경

- DROP : 테이블 삭제

- RENAME : 테이블 이름 변경

- COMMENT : 테이블 및 컬럼 주석 추가

- TRUNCATE : 데이터 초기화

`DML (Data Manipulation Languate) : 데이터를 조작`

- SELECT : 데이터 조회

- INSERT : 데이터 삽입

- UPDATE : 데이터 업데이트

- DELETE : 데이터 삭제

`DCL (Data Control Language) : 데이터 제어`

- GRANT : 특정 데이터베이스 사용자에게 권한 부여

- REVOKE : 특정 데이터베이스 사용자의 권한 취소

- COMMIT : 트랜잭션의 작업이 정상적으로 완료

- ROLLBACK : 트랜잭션의 작업이 비정상적으로 종료되어 원래 상태로 복구

### 별칭

| 파일 시스템 | DB 모델링  | RDB    |
| ----------- | ---------- | ------ |
| 파일        | 엔티티     | 테이블 |
| 레코드      | 튜플       | 행     |
| 키          | 유니크 값  | 키     |
| 필드        | 어트리뷰트 | 컬럼   |

### CREATE

데이터베이스 생성
`CREATE DATABASE [DB명]`

테이블 생성

```sql
CREATE TABLE [테이블명]
(
  [컬럼명][타입][컬럼속성][DEFAULT값][COMMENT],
  ...
  ...
  PRIMARY KEY([기본키 컬럼])
);
```

### INSERT

데이터 삽입

```sql
INSERT INTO [테이블 이름]
(
  [컬럼이름1],
  [컬럼이름2],
  [컬럼이름3],
)
VALUES
(
  [컬럼1의 데이터 값],
  [컬럼2의 데이터 값],
  [컬럼3의 데이터 값],
)
```

없어도 되는 값

- NULL 허용 인 컬럼
- DEFAULT값을 가지는 컬럼
- AUTO_INCREMENT (PRIMARY KEY) 컬럼

### UPDATE

데이터 업데이트

```sql
UPDATE [테이블 이름] SET [컬럼이름]=[값],
...
...
WHERE
[조건절]
```

### SELECT

데이터 조회

```sql
SELECT [선택할 필드]
FROM [테이블 명] AS [별칭]
WHERE [조건절]
```

### 문자열

| Type       | Java   | 설명                       |
| ---------- | ------ | -------------------------- |
| CHAR       | String | 고정 길이의 문자열 데이터  |
| VARCHAR    | String | 가변 길이의 문자열 데이터  |
| TINYTEXT   | String | 문자열 데이터 (255)        |
| TEXT       | String | 문자열 데이터 (65535)      |
| MEDIUMTEXT | String | 문자열 데이터 (16777215)   |
| LONGTEXT   | String | 문자열 데이터 (4294969295) |
| JSON       | String | JSON 문자열 데이터         |

### 숫자형

| Type      | Java          | 설명                                          |
| --------- | ------------- | --------------------------------------------- |
| TINYINT   | Interger, int | 정수형 데이터 -128 ~ +127, 0 ~ 255            |
| SMALLINT  | Interger, int | 정수형 데이터 타입 -32768 ~ +32767, 0 ~ 65536 |
| MEDIUMINT | Interger, int | 정수형 데이터                                 |
| INT       | Interger, int | 정수형 데이터                                 |
| BIGINT    | Long          | 정수형 데이터 (무제한 수 표현)                |
| FLOAT     | Float, float  | 부동소수점 데이터                             |
| DECIMAL   | BigDemical    | 고정소수점 데이터                             |
| DOUBLE    | Double        | 부동소수형데이터 데이터                       |

### 날짜형

| Type      | Java                    | 설명                                        |
| --------- | ----------------------- | ------------------------------------------- |
| DATE      | Date, LocalDate         | 날짜 (년도, 월, 일) 형태 기간 데이터        |
| TIME      | Time, LocalTime         | 시간 (시, 분, 초, 나노초) 형태 데이터       |
| DATETIME  | DateTime, LocalDateTime | 날짜와 시간 데이터                          |
| TIMESTAMP | DateTime, LocalDateTime | 날짜와 시간 데이터, Time Zone의 속성을 사용 |
| Year      | Year                    | 년도 표현 데이터 타입                       |

### 이진형

| Type       | Java   | 설명                          |
| ---------- | ------ | ----------------------------- |
| BINARY     | byte[] | CHAR 형태의 이진 타입         |
| BYTE       | byte[] | CHAR 형태의 이진 타입         |
| VARBINARY  | byte[] | VARCHAR 형태의 이진 타입      |
| TINYBLOB   | byte[] | 이진 데이터 타입 (255)        |
| BLOB       | byte[] | 이진 데이터 타입 (65535)      |
| MEDIUMBLOB | byte[] | 이진 데이터 타입 (16777215)   |
| LONGBLOB   | byte[] | 이진 데이터 타입 (4294969295) |
