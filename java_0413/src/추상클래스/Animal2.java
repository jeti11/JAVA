package 추상클래스;

// 추상 클래스로 선언한 Animal2 클래스
public abstract class Animal2 {
  public String kind;

  public void breathe() {
    System.out.println("숨을 쉽니다.");
  }

  // 추상 메소드로 선언한 sound() 메소드
  public abstract void sound();
}
