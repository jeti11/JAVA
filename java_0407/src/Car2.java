public class Car2 {
  // 생성자 : 자바 클래스에서 new 키워드와 함께 실행되어 객체를 생성하는 자동실행 메소드
  // 해당 객체의 필드를 초기화 함
  // 생성자는 클래스의 이름과 동일함
  // 생성자는 반환값이 없음
  // 생성자는 다른 메소드가 생성자를 호출할 수 없음
  // 생성자는 여러개 선언할 수 있음 (생성자 오버로딩)
  // 기본(default) 생성자는 클래스 이름과 동일하고 매개변수가 없는 생성자를 뜻함
  // 생성자가 하나도 없을 경우 컴파일러는 자동으로 기본 생성자를 만듬
  // 컴파일러가 자동으로 생성하는 기본 생성자는 소스코드의 내용이 없음
  // 생성자를 하나라도 직접 생성 시 컴파일러가 자동으로 기본 생성자를 만들지 않음

  public Car2() {

  }
  public Car2(String color, int cc) {

  }
}
