package 매개변수다형성;

public class Driver {
  // 인터페이스를 매개변수로 사용하는 메소드
  public void drive(Vehicle vehicle) {
    vehicle.run();
  }
}
