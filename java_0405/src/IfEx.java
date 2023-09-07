import java.util.Scanner;

public class IfEx {
  public static void main(String[] args) {
    // if문 : javascript의 if문과 동일함


    // Scanner : JAVA에서 지원하는 표준 입력(키보드 입력)을 받는 클래스
    // next() : 사용자의 키보드 입력을 문자열로 받음
    // nextInt() : 사용자의 키보드 입력을 정수로 받음

    // 사용방법 :
    // Scanner sc = new Scanner(System.in);
    // 변수명 = sc.next();
    // 변수명 = sc.nextInt();


    Scanner sc = new Scanner(System.in);
    System.out.println("점수를 입력해주세요 : ");
    int score = sc.nextInt();

    System.out.println("당신의 점수는 " + score + "점 입니다.");

    if (score >= 90) {
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A입니다.");
    }

    if ( score < 90) {
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B입니다.");
    }

    System.out.println("\n-------- if ~ else ---------\n");

    if (score >= 90) {
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A입니다.");
    }
    else {
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B입니다.");
    }

    System.out.println("\n-------- else if ---------\n");

    if (score >= 90) {
      System.out.println("점수가 100 ~ 90 입니다.");
      System.out.println("등급은 A입니다.");
    }
    else if (score >= 80) {
      System.out.println("점수가 80 ~ 89 입니다.");
      System.out.println("등급은 B입니다.");
    }
    else if (score >= 70) {
      System.out.println("점수가 70 ~ 79입니다.");
      System.out.println("등급은 C입니다.");
    }
    else if (score >= 60) {
      System.out.println("점수가 70 미만입니다.");
      System.out.println("등급은 D입니다.");
    }




















  }
}
