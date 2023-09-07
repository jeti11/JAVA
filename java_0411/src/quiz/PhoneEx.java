package quiz;

import java.util.Scanner;

public class PhoneEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // for문과 배열을 이용한 방법
    Phone[] phones = new Phone[2];

    for (int i = 0; i < phones.length; i++) {
      System.out.print("이름과 전화번호 입력 >> ");
      String name = sc.next();
      String tel = sc.next();

      phones[i] = new Phone(name, tel);
    }
    for (int i = 0; i < phones.length; i++) {
      System.out.println(phones[i].getName() + "의 번호" + phones[1].getTel());
    }
//    System.out.println("이름과 전화번호 입력");
//    String inputName = sc.next();
//    String inputTel = sc.next();
//
//    System.out.println("이름과 전화번호 입력");
//    String inputName2 = sc.next();
//    String inputTel2 = sc.next();
//
//    Phone p1 = new Phone(inputName, inputTel);
//    System.out.println(p1.getName() + "의 번호 " + p1.getTel());
//
//    Phone p2 = new Phone(inputName2, inputTel2);
//    System.out.println(p2.getName() + "의 번호 " + p2.getTel());
  }
}
