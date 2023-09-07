package 디폴트메소드;

public class Marine implements Unit {
  @Override
  public void move() {
    System.out.println("마린이 달려갑니다.");
  }

  @Override
  public void stop() {
    System.out.println("마린이 멈춥니다.");
  }

  @Override
  public void attack() {
    System.out.println("마린이 총을 쏩니다.");
  }

  @Override
  public void steamPack() {
    System.out.println("마린이 스팀팩을 사용합니다.");
    System.out.println("체력의 10% 감소하는 대가로 공격력과 공격속도가 10초간 2배 증가합니다.");
  }
}
