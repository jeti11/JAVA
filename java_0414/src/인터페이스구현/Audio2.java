package 인터페이스구현;

public class Audio2 implements RemoteControl {
  private int volume;
  private boolean mute;

  @Override
  public void turnOn() {
    System.out.println("Audio 전원을 켭니다.");
  }

  @Override
  public void turnOff() {
    System.out.println("Audio 전원을 끕니다.");

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

    System.out.println("Audio 현재 볼륨 : " + this.volume);
  }

  @Override
  public void setMute(boolean mute) {
    this.mute = mute;
    if (mute) {
      System.out.println("Audio 무음처리 합니다.");
    }
    else {
      System.out.println("Audio 무음 해제합니다.");
    }
  }
}

























