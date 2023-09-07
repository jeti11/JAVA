package 인터페이스구현;

public interface RemoteControl {
  // 인터페이스 : 추상클래스의 개념이 확장된 것 -> 인터페이스도 객체 생성 불가
  // -> 자식 클래스가 구현해야함

  // 인터페이스의 구성멤버 (기본멤버 : 상수, 추상메소드 / JAVA 8 부터 정적메소드, 디폴트메소드 추가됨)
  // 1. 정적멤버 : 상수 / 정적메소드
  // 2. 추상 메소드
  // 3. 디폴트 메소드


  // 인터페이스의 필드 (상수)
  // 상수이기 때문에 선언과 동시에 데이터 입력 -> static 초기화 블록 사용 불가
  int MAX_VOLUME = 10;
  
  public static final int MIN_VOLUME = 0; // public static final 써도 되고 안써도 되는데, 다른 사람이 코드를 보는 경우를 생각해서 쓰는방향이 좋음


  // 인터페이스의 메소드 (추상 메소드)
  // public abstract 키워드를 생략해도 컴파일 시 자동으로 추가됨
  // 자식 클래스는 반드시 추상 메소드를 상속받아 구현해야 함
  // 상속받은 추상 메소드를 구현하지 않으면 해당 클래스도 추상 클래스가 됨
  void turnOn();
  void turnOff();
  void setVolume(int volume);

  // 인터페이스의 추가된 멤버 (디폴트 메소드)
  default void setMute(boolean mute) {
    if (mute) {
      System.out.println("무음 모드 입니다.");
    }
    else {
      System.out.println("무음 모드 해제합니다.");
    }
  }

  // 인터페이스의 추가된 멤버 (정적 메소드)
  static void changeBattery() {
    System.out.println("건전지를 교체합니다.");
  }
}
