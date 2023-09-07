package 필드메소드다형성;

public class CarEx {
  public static void main(String[] args) {
    Car car = new Car();

    for(int i=1; i<=5; i++) {
      int problemLocation = car.run();
      switch(problemLocation) {
        case 1:
          System.out.println("앞왼쪽 HankookTire로 교체");
          // 자동타입변환에 의해서 frontLeftTire 부모 클래스 타입에 자식인 HankookTire 클래스 타입의 객체가 들어감 --> HankookTire의 roll()로 실행됨
          car.frontLeftTire = new HankookTire("앞왼쪽", 15);
          break;
        case 2:
          System.out.println("앞오른쪽 KumhoTire로 교체");
          car.frontRightTire = new KumhoTire("앞오른쪽", 13);
          break;
        case 3:
          System.out.println("뒤왼쪽 HankookTire로 교체");
          car.backLeftTire = new HankookTire("뒤왼쪽", 14);
          break;
        case 4:
          System.out.println("뒤오른쪽 KumhoTire로 교체");
          car.backRightTire = new KumhoTire("뒤오른쪽", 17);
          break;
      }
      System.out.println("----------------------------------------");
    }

    System.out.println("\n---------------------------------------\n");

    Car2 car2 = new Car2();

    for (int i = 1; i <= 5; i++) {
      int problemLocation = car2.run();

      if (problemLocation != 0) {
        System.out.println(car2.tires[problemLocation - 1].location + " HankookTire로 교체");
        car2.tires[problemLocation - 1] = new HankookTire(car2.tires[problemLocation - 1].location, 15);
      }

      System.out.println("-------------------------------------");
    }
  }
}
