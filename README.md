# 📌 C-ToJava
기존 알고리즘 언어인 C++에서 Java로 옮기기 위한 문제풀이
혼자서 운영하는 알고리즘 스터디

# 🌱규칙
1. 하루에 한문제씩은 풀기 - 실력이 나아지면 문제개수 늘려나갈것
01.05~ 1문제씩
2. 혼자서 운영하지만 바로 push하지 말고 pr를 통해 새로 알게된 지식적기

# 🍭새로알게된 메소드
<섹션1>
* readLine() : 한줄씩 읽기
* BufferedReader는 String으로 받기 때문에 int로 저장시 Interger.parseInt() 이용
* 문자열을 숫자로 - Integer.parseInt();
* StringTokenizer : 우리가 지정한 구분자로 문자열을 쪼개주는 클래스. 지정안하면 공백기준
* StringBuilder : reverse()를 사용하기 위해 사용. -> String에는 reverse()없음
* Character.isAlphabetic() : 알파벳인지 확인
* String.valueOf(char 문자열) : char을 sgring화
* char배열의 길이 : length
* string의 길이 : length()
* string 의 i번째 인덱스 원소 접근: .charAt(인덱스) 🌟
* indexOf(문자) : string에서 0번째부터 문자가 처음으로 발견되는 인덱스
* [^A-Z] : A~Z가 아닌 문자
* equalsIgnoreCases : 대소문자구별하지 않고 문자열 비교
* 숫자인지 확인 - isDigit()
* 절대값 : Math.abs()
* 둘중 작은값 구하기 : Math.min(a,b)
* 특정 문자의 인덱스값 얻기 : string문자.indexOf(특정문자, 시작idx)
* 특정문자로 바꾸기 : replace(바꿀문자,바꿔질문자) - Day7_2
* 2진수를 아스키코드로 Integer.parseInt(2진수,2) - Day7_2
* 아스키코드를 문자로 : 단순히 char로 바꿔주기만 하면된다. - Day7_2

<섹션2>
ArrayList 선언 :  ArrayList<Integer> alist = new ArrayList<>()
배열 요소 추가 : .add()
배열 요소 접근 : .get()
배열 요소 존재여부 : .isEmpty()

# 🐳오답노트
<섹션1>
* readLine() -> readline으로 자꾸 실수한다. L 대문자!
* 문자열 끝에 " "(빈공간)하나 추가하기 
* int 배열 5 초기화 : Int[] v = new Int[5]
<섹션2>

