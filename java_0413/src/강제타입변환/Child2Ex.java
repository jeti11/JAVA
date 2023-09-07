package 강제타입변환;

public class Child2Ex {
  public static void main(String[] args) {
    System.out.println("----- Parent2 클래스 타입의 객체 -----");
    Parent2 p = new Parent2();
    p.field1 = "부모 필드 1";
    p.method1();
    p.method2();

    System.out.println("\n----- Child2 클래스 타입의 객체 -----");
    Child2 c = new Child2();
    c.field1 = "상속받은 필드 1";
    c.field2 = "자식클래스 전용 필드 2";
    c.method1();
    c.method2();
    c.method3();

    System.out.println("\n----- Parent2에 Child2 객체 대입 -----");
    p = c;
    p.field1 = "data1";
//    p.field2 = "data2"; // 부모 클래스 타입의 변수에 Child2 클래스 타입의 객체를 대입하여 Child2 클래스 타입 전용 필드인 field2는 사용 못함(부모 클래스 타입의 필드만 사용가능)
    p.method1();
    p.method2();
//    p.method3(); // 부모 클래스 타입의 변수에 Child2 클래스 타입의 객체를 대입하여 Child2 클래스 타입 전용 메소드인 method3은 사용 못함(부모 클래스 타입의 메소드만 사용가능)

    System.out.println("\n----- 다시 Child2 객체에 Parent2 객체를 대입 -----");
    // 원본이 자식 클래스인 Child2 클래스 타입의 객체인 Parent2 클래스 타입의 변수를 다시 자식 클래스 타입의 변수에 강제타입변환으로 대입
    Child2 c2 = (Child2)p; // 강제타입변환

    c2.field1 = "data 1";
    // 다시 child2 클래스 타입이 되었으므로 Child2 클래스의 전용 필드인 field2를 사용 가능
    c2.field2 = "data 2";
    c2.method1();
    c2.method2();
    // 다시 child2 클래스 타입이 되었으므로 Child2 클래스의 전용 메소드인 method3을 사용 가능
    c2.method3();
  }
}
