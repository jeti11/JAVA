package 디폴트메소드;

public class Wraith implements Unit {
  @Override
  public void move() {
    System.out.println("레이스가 날아갑니다.");
  }

  @Override
  public void stop() {
    System.out.println("레이스가 멈춥니다.");
  }

  @Override
  public void attack() {
    System.out.println("레이스가 미사일을 발사합니다.");
  }
}
