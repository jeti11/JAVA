package 강제타입변환;

public class Vehicle2Ex {
  public static void main(String[] args) {
    Vehicle2 v2 = new Bus2();

    v2.run();

//    v2.checkFare(); // 부모인 Vehicle2 인터페이스 타입의 변수에 자식 클래스인 Bus2 클래스의 객체를 대입하였기 때문에 부모인 Vehicle2 타입의 멤버만 사용가능
    // Bus2 타입의 전용 멤버인 checkFare() 메소드는 사용 불가능함

    // 자식 클래스 타입의 변수를 선언하고 부모 타입의 변수를 강제 타입 변환으로 대입함
    // 원본이 자식 클래스 타입의 객체일 경우에만 강제 타입 변환이 가능함
    Bus2 b2 = (Bus2) v2;
    b2.run();
    b2.checkFare();
  }
}
