package 예외처리;

public class Exception1 {
  // 에러 : 하드웨어의 잘못된 동작 또는 고장으로 인한 오류 -> 관리할 수 없는 오류
  // 예외 : 사용자의 잘못된 조자 또는 개발자의 잘못된 코딩으로 인한 오류 -> 관리할 수 있는 오류

  public static void main(String[] args) {
    // 예외 발생 상황 (NullPointerExceptrion) : 참조 주소가 없는 변수에 접근을 시도하는 경우
//    String data = null;
//    System.out.println(data.toString());


    // 예외 발생 상황 (ArrayIndexOutOfBoundsExceptrion) : 배열의 크기를 초과한 index를 부르는 경우
//    int[] arrNum = new int[] {10, 20, 30};
//
//    for (int i = 0; i < 5; i++) {
//      System.out.println("arrNum[" + i + "] : " + arrNum[i]);
//    }

    Dog dog = new Dog();
    changeDog(dog);

    // 예외 발생 상황 (ClassCastException) : 원본이 cat인데 Dog타입의 변수에 저장하려니 오류가 발생
    Cat cat = new Cat();
    changeDog(cat);

  }
  public static void changeDog(Animal animal) {
    Dog dog = (Dog) animal;
  }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
