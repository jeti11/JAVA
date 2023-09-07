package promotion2;

public class PromotionEx {
  public static void main(String[] args) {
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    // 자동타입변환
    // A클래스와 B, C, D, E 클래스는 상속관계이기 때문에 자동타입변환이 가능함
    A a1 = b;
    A a2 = c;
    A a3 = d;
    A a4 = e;

    // B클래스와 D클래스, C클래스와 E클래스는 상속관계이기 때문에 자동타입변환이 가능함
    B b1 = d;
    C c1 = e;

    // B 클래스와 E 클래스는 상속관계가 아니기 때문에 자동 타입변환이 발생하지 않음
//    B b2 = e;
    
    // C 클래스와 D 클래스는 상속관계가 아니기 때문에 자동 타입변환이 발생하지 않음
//    C c2 = d;
  }
}
