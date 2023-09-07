package 자동타입변환;

public class PromotionEx {
  public static void main(String[] args) {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();
    
    // 조상인 인터페이스 A의 변수 a 생성
    A a = null;
    
    // 조상인 인터페이스 타입 A의 변수 a에 자손 객체를 각 각 대입
    a = b;
    a = c;

    // 조상인 인터페이스 타입의 변수에 해당 인터페이스를 상속받은 클래스의 자식 객체를 대입하는것도 가능하다.
    a = d;
    a = e;
    
    
  }
}
