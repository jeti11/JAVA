

public class DmbCellPhone extends CellPhone { // CellPhone 클래스를 상속받아 사용하고 있음

  // 필드로 channel만 가지고 있음

  // 하지만 CellPhone 클래스의 필드, 메소드를 사용할 수 있음
  int channel;

  DmbCellPhone(String model, String color, int channel) {
//    super(); // -> 컴파일러가 부모의 기본 생성자를 자동으로 추가해준다. (클래스의 생성자 특징)
    this.model = model;
    this.color = color;
    this.channel = channel;
  }

  void turnOnDmb() {
    System.out.println("채널 : " + channel + "번 DMB 방송을 수신합니다.");
  }

  void turnOffDmb() {
    System.out.println("DMB 방송 수신을 종료합니다.");
  }

  void changeChannelDmb(int channel) {
    this.channel = channel;
    System.out.println("채널 " + channel + "번 방송으로 바꿉니다.");
  }
}























