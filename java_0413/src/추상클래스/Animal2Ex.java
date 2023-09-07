package 추상클래스;

import promotion2.A;

public class Animal2Ex {
  public static void main(String[] args) {
    // 추상 클래스인 Animal2 클래스를 상속받은 Dog2, Cat2 클래스를 객체화
    Dog2 dog = new Dog2();
    Cat2 cat = new Cat2();

    dog.sound();
    cat.sound();
    System.out.println("\n------------------------------");

//    Animal2 animal = new Animal2(); // 추상 클래스는 객체를 만들 수 없다.
    // 추상 클래스인 Animal2 클래스 타입의 변수 animal2 선언
    Animal2 animal2 = null;
    // 부모 클래스인 Animal2 클래스 타입의 변수 animal2에 자식 클래스 타입의 객체를 생성하여 저장(다형성)
    animal2 = new Dog2(); // new Dog2() = dog
    // 부모 클래스 타입으로 메소드를 실행하지만 실제로 동작되는 것은 자식 타입의 객체가 가지고 있는 메소드가 동작됨
    animal2.sound();
    animal2 = new Cat2();
    animal2.sound();
  }
}
