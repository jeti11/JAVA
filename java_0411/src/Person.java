public class Person {
  // final 필드 : 수정이 안되는 값 (상수와는 다름)
  // 선언할때 한번, 생성자 안에서 한번 값을 입력 가능함

  // final 키워드를 통해 읽기 전용 필드 생성
  final String nation = "KOREA"; // 선언과 동시에 데이터를 단 한번만 입력가능
  final String ssn;
  String name;

  public Person(String ssn, String name) {
    // 생성자를 통해 데이터를 단 한번만 입력 가능
    this.ssn = ssn;
    this.name = name;
  }
}
