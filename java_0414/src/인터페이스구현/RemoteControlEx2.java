package 인터페이스구현;

public class RemoteControlEx2 {
  public static void main(String[]args ) {
    // 익명 구현 객체 : 인터페이스를 통해서 1회용 클래스를 생성하고 바로 new 생성자()를 통해서 객체를 생성하는 방식
    // 클래스의 이름이 존재하지 않기 때문에 추가적으로 객체를 생성할 수 없음
    // 이런게 있다는거만 알고가기
    RemoteControl rc = new RemoteControl() { // 익명 구현 객체
      int volume; // 익명 구현 객체 안에서만 사용가능한 변수

      @Override
      public void turnOn() {
        System.out.println("전원을 켭니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("전원을 끕니다.");
      }

      @Override
      public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
          this.volume = RemoteControl.MAX_VOLUME;
        }
        else if (volume < RemoteControl.MIN_VOLUME) {
          this.volume = RemoteControl.MIN_VOLUME;
        }
        else {
          this.volume = volume;
        }
        System.out.println("현재 볼륨 : " + volume);
      }
    };

    rc.turnOn();
    rc.setVolume(5);
    rc.setVolume(10);
    rc.turnOff();
    rc.setMute(true);


  }
}
