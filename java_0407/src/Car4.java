public class Car4 {
  String company;
  String type;
  String model;
  String color;
  int price;


  // 생성자 오버로딩 : 매개변수의 개수, 데이터 타입, 순서가 달라야 가능함
  public Car4(){

  }

  public Car4(String company){
    this.company = company;
  }

  public Car4(String company, String type){
    this.company = company;
    this.type = type;
  }

  public Car4(String company, String type, String model) {
    this.company = company;
    this.type = type;
    this.model = model;
  }

  public Car4(String model, int price) {
    this.model = model;
    this.price = price;
  }

  public Car4(int price, String model) {
    this.price = price;
    this.model = model;
  }


  // 메소드는 생성자 호출 불가능
  // 생성자는 다른 생성자를 호출할 수 있음

  // this.
  // this(매개변수) : 다른 생성자 호출
}



















