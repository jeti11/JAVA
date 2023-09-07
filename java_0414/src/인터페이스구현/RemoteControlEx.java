package 인터페이스구현;

public class RemoteControlEx {
  public static void main(String[] args) {
    // 인터페이스 타입의 변수 rc 선언
    // 인터페이스도 추상 클래스처럼 객체를 만들 수 없지만 변수는 생성가능

    // 부모 타입의 변수에 자식 클래스 타입의 객체를 저장하는 것이 가능함
    RemoteControl rc = null;

    rc = new Audio();
    rc.turnOn();
    rc.setVolume(10);
    rc.setMute(true);
    rc.setMute(false);
    rc.turnOff();

    System.out.println("\n---------- -----------\n");
    rc = new Television();
    rc.turnOn();
    rc.setMute(true);
    rc.setVolume(5);
    rc.setMute(false);
    rc.turnOff();
  }
}
