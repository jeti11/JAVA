package 인터페이스상속;
// 인터페이스 InterA, InterB를 상속받은 InterC를 구현한 클래스 ImplC

public class ImplC implements InterC {
  // InterA, InterB, InterC가 가지고 있는 추상메소드를 모두 구현함
  @Override
  public void methodA() { // InterA의 추상 메소드를 구현
    System.out.println("ImplC - methodA called");
  }

  @Override
  public void methodB() { // InterB의 추상 메소드를 구현
    System.out.println("ImplC - methodB called");
  }

  @Override
  public void methodC() { // InterC의 추상 메소드를 구현
    System.out.println("ImplC - methodC called");
  }
}
