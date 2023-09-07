package 추상클래스;

public class Dog2 extends Animal2 {
  public Dog2() {
    this.kind = "포유류";
  }


  @Override // 상속받은 추상 메소드를 오버라이딩한 메소드
  public void sound() {
    System.out.println("멍멍");
  }
}
