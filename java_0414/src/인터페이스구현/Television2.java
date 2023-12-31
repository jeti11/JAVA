package 인터페이스구현;

public class Television2 implements RemoteControl {
  public int volume;
  @Override
  public void turnOn() {
    System.out.println("TV 전원을 켭니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("TV 전원을 끕니다.");
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
    System.out.println("TV 현재 볼륨 : " + this.volume);
  }
}
