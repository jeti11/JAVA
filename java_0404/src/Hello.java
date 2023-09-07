
// 메소드(자바스크립트의 함수와 동일한 기능을 가지고 있음)
// 클래스의 멤버일 경우 이름을 메소드라고 함
// 클래스의 멤버가 아닐 경우 함수라고 함

// class 만들기 규칙
// 1) class 이름은 해당 class 파일명
// 2) 하나의 파일에 하나의 클래스 작성
// 3) 클래스 이름은 첫글자는 대문자, 나머지는 소문자
// 4) 두 개 이상의 단어로 이름을 정할 경우 각 단어의 첫글자는 대문자로, 나머지는 소문자
// 5) 파일명과 같은 class만 public을 사용할 수 있음

// public : 접근제한자

//식별자 규칙
// 1) 영어사용
// 2) 대소문자 구분
// 3) 특수문자 사용불가(_, $ 제외)
// 4) 숫자사용가능(2번째 이후로 사용가능)
// 5) 자바 예약어 사용불가
// 6) 첫단어는 모두 소문자, 두번째 이후는 첫글자 대문자
// 6-1) class는 무조건 첫글자 대문자, 나머지 소문자

// 자바의 데이터 타입
// ※기본타입 - 데이터 자체를 저장
// ※참조타입 - 데이터가 존재하는 메모리주소 저장


// 논리형 : js의 논리형과 동일, true, false
// 정수형 : 소수점이 없는 숫자데이터, 음수 양수
// 실수형 소수점이 있는 숫자 데이터, 음수 양수


// 논리형 : boolean
// 정수형 : char(문자 + 정수타입), byte, short, int, long
// 실수형 : float(4byte), double(기본형, 8byte)


public class Hello {

  public static int sum(int n, int m) { // int -> 데이터타입 = 정수
    return n + m;
  }

  public static void main(String[] args) {
    int i = 20;
    int s;
    char a;

    s = sum(i, 10);
    a = '?';

    System.out.println(a); // -> 자바스크립트의 console.log()와 같은 기능
    System.out.println("Hello");
    System.out.println(s);
  }
}
























