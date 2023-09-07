public class Singleton {
  // 싱글톤 : 하나의 애플리케이션 내에서 단 하나만 생성되는 객체
  // 자신 타입의 객체를 생성
  // 외부에서 직접적인 접근을 차단
  private static Singleton singleton = new Singleton();



  private Singleton() {} // private 사용시 외부에서 사용 불가


  // 정적 메소드 선언
  // 미리 만들어 놓은 객체를 우회하여 사용하도록 제공
  static Singleton getInstance() {
    // 정적 필드인 singleton을 외부로 전달
    return singleton;
  }
}
