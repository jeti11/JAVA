public class CarEx {
  public static void main(String[] args) {
    Car myCar = new Car();
    // Car : 클래스
    // myCar : 클래스타입의 변수
    // new : 객체생성
    // Car() : 생성자

    // 해당 객체의 필드에 접근하려면 객체명 뒤에 "."을 붙여서 사용
    System.out.println("제작 회사 : " + myCar.company);
    System.out.println("모델명 : " + myCar.model);
    System.out.println("색상 : " + myCar.color);
    System.out.println("최고속도 : " + myCar.maxSpeed);
    System.out.println("현재속도 : " + myCar.speed);

    myCar.speed = 50;
    System.out.println("수정된 현재 속도 : " + myCar.speed);

    // 하나의 클래스에서 여러개의 객체를 생성할 수 있음
    Car yourCar = new Car();
    yourCar.company = "기아자동차";
    yourCar.model = "EV6";
    yourCar.color = "밝은 회색";
    yourCar.maxSpeed = 300;
    yourCar.speed = 50;

    System.out.println("제작 회사 : " + yourCar.company);
    System.out.println("모델명 : " + yourCar.model);
    System.out.println("색상 : " + yourCar.color);
    System.out.println("최고속도 : " + yourCar.maxSpeed);
    System.out.println("현재속도 : " + yourCar.speed);
  }
}
