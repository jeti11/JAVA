package 인터페이스구현;

public class SmartTelevisionEx {
  public static void main(String[] args) {
    // 인터페이스 RemoteControl, Searchable 를 다중 상속 받은 클래스 SmartTelevision 타입의 변수 stv 를 선언과 동시에 객체를 생성
    SmartTelevision stv = new SmartTelevision();

    // RemoteControl의 멤버와 Searchable의 멤버를 모두 사용할 수 있음
    stv.turnOn();
    stv.setVolume(50);
    stv.setVolume(5);
    stv.setMute(true);
    stv.setMute(false);
    stv.search("youtube");
    stv.turnOff();

    System.out.println("---- ---- -----");

    RemoteControl irc = null; // 인터페이스 타입임을 표시하는 용도로 "i" 사용
    Searchable is = null;

    irc = stv;
    irc.turnOn();
    irc.setVolume(-100);
    irc.setMute(true);
    // irc는 RemoteControl 인터페이스 타입의 변수이므로 인터페이스 RemoteControl의 멤버만 사용할 수 있음
//    i_rc.search("youtube");
    irc.turnOff();

    is = stv;
    is.search("youtube");
    // is는 Searchable 인터페이스 타입의 변수이므로 인터페이스 Searchable의 멤버만 사용할 수 잇음
//    is.turnOn();
//    is.turnOff();
  }
}
