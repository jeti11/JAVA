public class Calculator4 {
  // 정적(static) 멤버 : 클래스의 멤버로 동작하는 필드와 메소드
  // 객체 생성하지 않고 클래스의 이름을 통해서 필드와 메소드에 접근이 가능
  // 정적 멤버는 클래스를 통해서 접근 (객체를 통해 접근도 가능하긴 하나 바람직하지 못함)
  // 정적 멤버는 데이터를 공유
  // 클래스명.멤버명 으로 접근

  static double pi = 3.14159;

  static int plus(int x, int y) {
    return x + y;
  }

  static int minus(int x, int y) {
    return x - y;
  }
}
