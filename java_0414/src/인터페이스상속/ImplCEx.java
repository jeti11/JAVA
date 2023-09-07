package 인터페이스상속;

public class ImplCEx {
  public static void main(String[] args) {

    ImplC im = new ImplC(); // 인터페이스 InterC를 구현한 클래스 implC 타입의 객체 생성
    System.out.println("\n ---- 인터페이스를 구현한 객체 ----\n");
    // ImplC 클래스에서 구현한 methodA, methodB, methodC 사용
    im.methodA();
    im.methodB();
    im.methodC();

    System.out.println("\n ---- InterA 타입의 변수에 대입 ----\n");
    InterA interA = im; // 조상인 InterA 타입의 변수에 자손 객체를 대입
    interA.methodA(); // InterA의 멤버인 methodA만 사용가능
//    interA.methodB();
//    interA.methodc();

    System.out.println("\n ---- InterB 타입의 변수에 대입 ----\n");
    InterB interB = im; // 조상인 InterB 타입의 변수에 자손 객체를 대입
//    interB.methodA();
    interB.methodB(); // InterB의 멤버인 methodB만 사용가능
//    interB.methodC();

    System.out.println("\n ---- InterC 타입의 변수에 대입 ----\n");
    InterC interC = im; // 부모인 InterC 타입의 변수에 자식 객체를 대입
    // InterC는 InterA와 InterB를 다중상속 했기 때문에 methodA, methodB 및 자신 전용의 methodC를 모두 사용가능
    interC.methodA();
    interC.methodB();
    interC.methodC();
  }
}
