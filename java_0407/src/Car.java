public class Car { // Car : 사용자 정의 데이터 타입
  // 필드의 사용위치
  // 객체 내부에서는 일반변수 처럼 사용
  // 객체 외부에서는 객체명.필드이름 형식으로 불러와야함
  String company = "쌍용자동차"; // 필드 선언과 동시에 초기값 설정
  String model = "토레스";
  String color = "회색";
  int maxSpeed = 250;
  int speed; // 필드 선언만 한 것

  // 생성자를 직접 생성하지 않았기 때문에 컴파일 되면 기본 생성자가 생성됨
}
