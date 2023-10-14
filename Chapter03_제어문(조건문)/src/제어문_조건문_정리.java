/*
 *   page 3 => 자바 실행환경 
 *   A.java ======> A.class =======> 한줄씩 읽어서 출력 
 *           javac     |      java
 *           (컴파일)    |    (인터프리터)
 *                    바이트 코드 (배포) ==> 모든 운영체제에 호환 
 *   page 22 => 들여쓰기 
 *   page 23 주석 //(한줄 주석) => 번역이 안되는 부분 => 소스 설명 
 *   ----------------------------------------------------
 *   약속 
 *    => 1. 클래스명은 대소문로 시작한다 
 *       2. 변수는 소문자 시작 
 *       3. 상수는 전체를 대문자 MAX_VALUE
 *       ------------------------- 
 *   2장 => 프로그램 기초 
 *   1) 25page => 변수 
 *      => 메모리에 한개의 데이터를 저장하는 공간의 이름 
 *         ------- 메모리는 주소에 대한 별칭
 *   2) 형식
 *      데이터형(메모리 크기) 변수명;
 *      ----------------
 *      저장할 수 있는 공간 : 정수 / 실수 / 논리 / 문자 => 기본형
 *      정수 저장 공간 
 *      -----------
 *        byte : -128~127 (네트워크 송수신, 파일 읽기 , 파일 쓰기,
 *                         사이트 검색)
 *        https://www.google.com/search?q=%EC%9E%90%EB%B0%94
 *        
 *        int : -21억 4천 ~ 21억 4천 
 *          ==> default : 컴퓨터가 인식하는 숫자는 int 
 *        long 
 *        -----------------------------------------
 *           int와 long => L(l)
 *      실수 저장하는 공간 
 *          double (8byte) : 소수점 15자리 : default 
 *      문자 저장하는 공간 
 *          char (2byte) => 0~65535 => 문자 번호 
 *               ------- 멀티바이트 => Unicode 
 *       
 *      true/false 저장 공간 
 *          boolean : 1byte => true/false만 저장이 가능 
 *      ------------------------------- 30page 
 *      
 *      변수의 명명법(메소드,클래스,인터페이스..적용) : 식별자  
 *      ----------
 *      1) 알파벳이나 한글로 시작한다 
 *         ----- 대소문자를 구분 
 *      2) 숫자 사용이 가능 (앞에 사용 금지)
 *      3) 특수문자 사용이 가능 ( $ , _ )
 *      4) 키워드는 사용 금지 (이미 사용중인 단어)
 *      5) 변수는 공백을 포함 할 수 없다
 *      ---------------------------------- 26page
 *      
 *      38page 연산자 
 *      ------------
 *      단항연산자 
 *        증감연산자 (++ , --)
 *        부정연산자 (!)
 *        형변환연산자 (데이터형)
 *      이항연산자
 *        산술연산자 (+,-,*,/,%)
 *                 -- 문자열 결합 포함 
 *        비교연산자 (== , != , < , > , <= ,>=)
 *        논리연산자 (&& , ||)
 *        대입연산자 (= , += , -=)
 *      삼항연산자 
 *        (조건)?값:값 ==> if~else 
 *        
 *    ---------------------------------------------
 *    54page 
 *    -------
 *      자바에서 제공하는 제어문 
 *      조건문 54page
 *        = 단일 조건문 : 독립적으로 사용 => 해당되는 조건이 많은 경우 
 *            형식)
 *                 if(조건문)
 *                 {
 *                    조건이 true일경에만 처리 
 *                 }
 *                 ==> false면 건너뛴다
 *            56page
 *        = 선택 조건문 : true와 false를 나눠서 처리 
 *            형식)
 *                 if(조건문) => 조건 (비교연산자,부정연산자,논리연산자만 사용이 가능)
 *                 {
 *                    조건이 true일때 처리 
 *                 }
 *                 else
 *                 {
 *                    조건이 false일때 처리 
 *                 } 
 *            58page 
 *        = 다중 조건문 : 조건문 여러개를 나열 => 해당 조건 1개만 수행이 가능하게 만든다 
 *          형식)
 *               if(조건문)
 *               {
 *                  조건이 true =>  문장 수행 종료
 *                  조건이 false => 밑에 있는 조건을 찾는다
 *               }
 *               else if(조건문)
 *               {
 *                  조건이 true =>  문장 수행 종료
 *                  조건이 false => 밑에 있는 조건을 찾는다
 *               }
 *               else if(조건문)
 *               {
 *                  조건이 true =>  문장 수행 종료
 *                  조건이 false => 밑에 있는 조건을 찾는다
 *               }
 *               else
 *               {
 *                   해당 조건이 없는 경우에 사용 
 *               }
 *        = 선택문 
 *      반복문
 *        = for : 횟수지정 
 *        = while : 횟수가 없는 경우 => 파일종료,오라클의 저장 데이터 읽기
 *        = do~while : 반드시 한번이상을 수행 
 *      반복제어문 
 *      ------------------------------
 *        = break : 반복 종료 (예외=> switch~case)
 *        = continue : 특정부분을 제외 
 *      --------------------------- 반복문에서만 사용이 가능 
 *         
 *   
 */
public class 제어문_조건문_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(1000000000000000L);
	}

}
