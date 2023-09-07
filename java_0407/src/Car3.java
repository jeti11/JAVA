public class Car3 {
  String company = "쉐보레";
  String model;
  String type = "SUV";
  String color;
  int price;

  // 생성자를 이용해서 필드를 초기화
  // 필드의 사용 위치 : 객체 내부에서 필드를 사용하는 예시
  public Car3() {
    model = "트레일블레이저";
    color = "파랑색";
    price = 2571;
  }

  // 매개변수가 잇는 생성자
  // 사용자가 직접 만들어야 함
  // 객체 생성 시 매개변수로 받은 데이터를 기반으로 필드를 초기화 함


  // this : 클래스 내부에서 객체 자기 자신임을 나타내는 키워드
  // 매개변수의 이름과 클래스의 멤버 변수인 필드의 이름이 같을 경우 서로 구분하기 위해서 사용함
  public Car3(String company, String type, String model, String color, int price) {
    this.company = company;
    this.type = type;
    this.model = model;
    this.color = color;
    this.price = price;
  }

}
