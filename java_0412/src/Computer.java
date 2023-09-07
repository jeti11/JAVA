// 클래스 Computer는 클래스 Calculator 을 상속받아 모든 멤버를 가져옴

public class Computer extends Calculator {

  // 부모 클래스인 Calculator 클래스에서 상속받은 areaCircle() 메소드

  // 오버라이딩 : 상속받은 메소드의 접근제한자, 반환값, 메소드이름, 매개변수의 개수/타입/순서까지 동일하게 구성하고, 코드블록의 내용만 수정한 메소드

  @Override
  double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle() 실행"); // 소스코드 println("Calculator" -> "Computer"로) 변경됨
    return Math.PI * r * r;
  }

  // 오버라이딩된 메소드
  // 오버라이딩 하려고 했지만 사용자의 실수에 의해서 선언부의 변경이 있을 경우, 오버라이딩이 되지 않고, 자식 클래스 전용의 메소드로 인식됨

  @Override
  public int sum(int x, int y) {
    System.out.println("Computer 클래스의 오버라이딩 된 total() 메소드");
    int result = x + y;
    System.out.println("두 수의 덧셈은 : " + result + "입니다.");
    return result;
  }
}

// 오버라이드(Override) 어노테이션 : 해당 메소드가 오버라이딩된 메소드임을 표시함
// 효과 : 부모 메소드가 숨겨지고, 재정의된 자식 메소드가 실행됨

