package 강제타입변환;

public class InstanceOfEx {
  public static void main(String[] args) {
    System.out.println("----- 원본이 Child3일 경우 -----");
    // 원본이 Child3 타입인 객체 생성
    Parent3 p1 = new Child3();
    method1(p1);
    method2(p1);

    System.out.println("\n----- 원본이 Parent3일 경우 -----");
    Parent3 p2 = new Parent3();
    method1(p2);
    method2(p2); // 원본이 Parent3 클래스 타입이라 강제타입변환시 오류 발생 -> instanceof 써서 검증과정 거치고 하라
  }

  public static void method1(Parent3 p) {
    if (p instanceof Child3) { // instanceof : 동일한 타입이면 true / 반대면 false
      Child3 c = (Child3) p;
      System.out.println("method1 - Child3으로 변환 성공");
    }
    else {
      System.out.println("method1 - Child3으로 변환 실패");
    }
  }

  public static void method2(Parent3 p) {
    Child3 c = (Child3) p;
    System.out.println("method2 - Child3으로 변환 성공");
  }
}
