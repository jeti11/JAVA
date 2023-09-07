import java.awt.*;
import java.util.Scanner;

public class Quiz {
  private static Scanner sc = new Scanner(System.in);

  // 84p의 open challenge 문제

  // 사용방법 :
  // Scanner sc = new Scanner(System.in);
  // 변수명 = sc.next();
  // 변수명 = sc.nextInt();


  public static void quiz01() {
    Scanner sc = new Scanner(System.in);
    System.out.println("철수 >> ");
    String inputChul = sc.next();
    System.out.println("영희 >> ");
    String inputYung = sc.next();


    if ((inputChul.equals("보")) && (inputYung.equals("보"))) {
        System.out.println("비겼습니다.");
      }
    else if ((inputChul.equals("보")) && (inputYung.equals("가위"))) {
      System.out.println("영희가 이겼습니다.");
    }
    else if ((inputChul.equals("보")) && (inputYung.equals("바위"))) {
      System.out.println("철수가 이겼습니다.");
    }
    else if ((inputChul.equals("가위")) && (inputYung.equals("가위"))) {
      System.out.println("비겼습니다.");
    }
    else if ((inputChul.equals("가위")) && (inputYung.equals("바위"))) {
      System.out.println("영희가 이겼습니다.");
    }
    else if ((inputChul.equals("가위")) && (inputYung.equals("보"))) {
      System.out.println("철수가 이겼습니다.");
    }
    else if ((inputChul.equals("바위")) && (inputYung.equals("가위"))) {
      System.out.println("철수가 이겼습니다.");
    }
    else if ((inputChul.equals("바위")) && (inputYung.equals("바위"))) {
      System.out.println("비겼습니다.");
    }
    else if ((inputChul.equals("바위")) && (inputYung.equals("보"))) {
      System.out.println("영희가 이겼습니다.");
    }


  }
  // 87p의 실습문제 2번
  public static void quiz02() {
    Scanner sc = new Scanner(System.in);
    System.out.print("몇 층인지 입력하세요 : "); // println 대신 print 써서 : 뒤에 커서 오도록
    int inputFloor = sc.nextInt();

    System.out.println(inputFloor * 5 + "m 입니다.");
  }

  public static void quiz03() {
    Scanner sc = new Scanner(System.in);
    System.out.println("x 값을 입력하세요 : ");
    int x = sc.nextInt();

    int y = x * x - 3 * x + 7;
    System.out.println("x = " + x + "," + "y = " + y);
  }

  public static void quiz04() {
    Scanner sc = new Scanner(System.in);
    System.out.print("사각형의 x 좌표를 입력하세요 : ");
    int x = sc.nextInt();
    System.out.print("사각형의 y 좌표를 입력하세요 : ");
    int y = sc.nextInt();

    if ((x >= 50) && (x <= 100)) {
      if ((y >= 50) && (y <= 100)) {
        System.out.println("점" + "(" + x + "," + y + ")은 (50,50)과 (100,100)의 사각형 내에 있습니다.");
      }
    }
    else {
      System.out.println("점" + "(" + x + "," + y + ")은 (50,50)과 (100,100)의 사각형 내에 존재 하지 않습니다.");
    }
  }

//  public static void quiz05() {
//    Scanner sc = new Scanner(System.in);
//    System.out.println("논리 연산을 입력하세요");
////    boolean inputBoolean = sc.nextBoolean();
////
////
////    switch () {
////      case "true AND false":
////        System.out.println("false");
////        break;
////
////      case "true OR false":
////        System.out.println("true");
////        break;
//    }
//  }

  public static void quiz06() {
    Scanner sc = new Scanner(System.in);
    System.out.println("금액을 입력하세요 : ");
    int m = sc.nextInt();

//    if (m != 0) {
//      int first = m / 50000;
//      int second = m % 50000 / 10000;
//      int third = m % 50000 % 10000 / 1000;
//      int forth = m % 50000 % 10000 % 1000 / 500;
//      int fifth = m % 50000 % 10000 % 1000 % 500 / 100;
//      int sixth = m % 50000 % 10000 % 1000 % 500 % 100 / 10;
//      int seventh = m % 50000 % 10000 % 1000 % 500 % 100 % 10 / 1;
//    System.out.println("오만원 " + first + "개");
//    System.out.println("만원 " + second + "개");
//    System.out.println("천원 " + third + "개");
//    System.out.println("500원 " + forth + "개");
//    System.out.println("100원 " + fifth + "개");
//    System.out.println("10원 " + sixth + "개");
//    System.out.println("1원 " + seventh + "개");
//    }

//    if (m != 0) {
//      int first = m / 50000;
//      int second = first * 50000 % 50000 / 10000;
//

//    }


  }

  public static void quiz07() {
    System.out.print("학점을 입력하세요 : ");
    String grade = sc.next();

    switch(grade) {
      case "A":
      case "B":
        System.out.println("Excellent");
        break;
      case "C":
      case "D":
        System.out.println("Good");
        break;
      case "F":
        System.out.println("Bye");
        break;
      default:
        System.out.println("잘못된 입력");
    }
  }

  public static void quiz08() {
    System.out.println("커피 주문하세요");
    String a = sc.next();
    int b = sc.nextInt();

//    if (a.equals("에스프레소")) {
//      System.out.println(b * 2000 + "원 입니다.");
//    }
//
//    else if (a.equals("아메리카노")) {
//      System.out.println(b * 2500 + "원 입니다.");
//    }
//
//    else if (a.equals("카푸치노")) {
//      System.out.println(b * 3000 + "원 입니다.");
//    }
//
//    else if (a.equals("카페라떼")) {
//      System.out.println(b * 3500 + "원 입니다.");
//    }

    switch(a) {
      case "에스프레소":
        System.out.println(b * 2000 + "원 입니다.");
        break;

      case "아메리카노":
        System.out.println(b * 2500 + "원 입니다.");
        break;

      case "카푸치노":
        System.out.println(b * 3000 + "원 입니다.");
        break;

      case "카페라떼":
        System.out.println(b * 3500 + "원 입니다.");
        break;
    }
  }


  public static void quiz09() {
    System.out.print("1~99 사이의 정수를 입력하세요");
    int n = sc.nextInt();

    int first = n / 10;
    int second = n % 10;

    if ((first % 3 == 0) && (second % 3 == 0)) {
      System.out.println("박수짝짝");
    }
    else if (((first % 3 == 0) && (second % 3 != 0)) || ((first % 3 != 0) && (second % 3 == 0))) {
      System.out.println("박수짝");
    }
    else {
      System.out.println("박수없음");
    }
  }

  public static void quiz10() {
    System.out.print("커피를 주문하세요 : ");
    String a = sc.next();
    int b = sc.nextInt();

    if (a.equals("에스프레소")) {
      if (b >= 10) {
        System.out.println((int)(2000 * b * 0.95) + "원 입니다.");
      }
      else if (b < 10) {
        System.out.println(2000 * b + "원 입니다.");
      }
    }
    else if (a.equals("아메리카노")) {
      System.out.println(2500 * b + "원 입니다.");
    }
    else if (a.equals("카푸치노")) {
      System.out.println(3000 * b + "원 입니다.");
    }
    else if (a.equals("카페라떼")) {
      System.out.println(3500 * b + "원 입니다.");
    }
  }

  public static void quiz211() {
    System.out.print("나이를 입력하세요 : ");
    int age = sc.nextInt();

    if ((age >= 20) && (age < 30)) {
      System.out.println("당신은 20대 입니다.");
    }
    else if ((age >= 30) && (age < 40)) {
      System.out.println("당신은 30대 입니다.");
    }





  }

  public static void main(String[] args) {
    quiz06();
  }
}
