package promotion1;

public class CatEx {
  public static void main(String[] args) {
    // 자동형변환 (쉽게 이해하려면 자식 객체의 자동형변환 후에는 부모 클래스 모습으로 분장한다고 생각하면됨 -> 부모 클래스의 멤버만 접근 가능
    // 부모 클래스인 promotion1.Animal 클래스 타입의 변수 animal에 promotion1.Animal 클래스 타입의 객체를 생성
    
    Animal animal = new Animal();
    // promotion1.Animal 클래스를 상속받은 Cat클래스 타입의 변수 cat을 선언하고 promotion1.Cat 클래스 타입의 객체를 생성
    Cat cat = new Cat();

    if (animal == cat) {
      System.out.println("두 객체는 같다.");
    }
    else {
      System.out.println("두 객체는 다르다.");
    }

    // 부모 클래스인 promotion1.Animal 클래스 타입의 변수 animal에 자식 클래스인 promotion1.Cat 클래스 타입의 객체를 대입
    // 자동 타입 변환이 발생하면서 부모 클래스인 promotion1.Animal 클래스타입의 변수에 자식 클래스인 promotion1.Cat 클래스타입의 객체가 저장됨
    animal = cat; // 변수 animal과 cat이 참조하고 있는 주소가 같게 된다.


    // 겉모양은 부모인 promotion1.Animal 클래스타입의 변수이지만, 실제데이터는 자식클래스인 promotion1.Cat 클래스 타입의 객체임
    if (animal == cat) {
      System.out.println("두 객체는 같다.");
    }
    else {
      System.out.println("두 객체는 다르다.");
    }
  }
}
