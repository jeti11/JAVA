public class Calculator {
  int num1;
  int num2;
  int result;

  public Calculator() {
    num1 = 10;
    num2 = 3;
    result = 0;
  }

  public Calculator(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
    this.result = 0;
  }

  public void sum() {
    result = num1 + num2;
    System.out.println("두 수의 덧셈은 : " + result + "입니다.");
  }

  public void sub() {
    result = num1 - num2;
    System.out.println("두 수의 뺄셈은 : " + result  + "입니다.");
  }

  public void multi(int num1, int num2) { // 메소드의 원형, 메소드 사용방법을 알 수 있다.
    // public : 접근제한자
    // void : 반환값
    // multi : 메소드 이름
    // (int num1, int num2) : 매개변수
    result = num1 * num2;
    System.out.println("두 수의 곱셈은 : " + result + "입니다.");
  }

  public void div(int num1, int num2) {
    result = num1 / num2;
    System.out.println("두 수의 나눗셈은 " + result + "입니다.");
  }

  // 리턴 문 기능
  // 1. 해당 메소드의 연산결과를 메소드를 호출한 곳으로 되돌려 줌
  // 2. 메소드의 실행을 강제종료 시키는 역할


}
