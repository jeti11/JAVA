package 추상클래스;

public class SmartPhoneEx {
  public static void main(String[] args) {

    // 추상클래스는 객체생성이 불가능함
    // 하지만, 추상클래스 타입의 변수는 생성할 수 있음
    Phone phone; // 변수 생성 가능
//    phone = new Phone(); // 객체 생성 실패

    SmartPhone smartPhone = new SmartPhone("아이유");

    smartPhone.turnOn();
    smartPhone.internetSearch();
    smartPhone.turnOff();
  }
}
