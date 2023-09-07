package pack2;

// pack2 패키지에는 A 클래스가없기 때문에 pack1에서 A를 가져와야 함
import pack1.A; // public 접근 제한자를 설정한 클래스 A이기 때문에 호출 가능함

// pack2 패키지에는 B 클래스가 없기 때문에 pack1에서 B를 가져와야 하지만,
//import pack1.B; // default 접근 제한자(패키지 외부에서 접근 불가)를 설정한 클래스 B이기 때문에 호출 불가능함

public class D {
  //  pack1 패키지에 있는 클래스 A를 사용하여 객체 생성
  A a = new A();

  // B 클래스가 default 접근제한자를 사용하여 외부 패키지에서 해당 클래스를 사용할 수 없음
//  B b = new B();
}
