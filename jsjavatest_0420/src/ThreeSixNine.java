import java.util.Scanner;

public class ThreeSixNine {
  public static void main(String[] args) {
    String eng[] = {"student", "love", "java", "happy", "future"};
    String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("영어 단어를 입력하세요 >> ");
      String word = sc.next();
      if (word.equals("student")) {
        System.out.println(kor[0]);
      }
      else if (word.equals("love")) {
        System.out.println(kor[1]);
      }
      else if (word.equals("java")) {
        System.out.println(kor[2]);
      }
      else if (word.equals("happy")) {
        System.out.println(kor[3]);
      }
      else if (word.equals("future")) {
        System.out.println(kor[4]);
      }
      else if (word.equals("exit")) {
        System.out.println("종료합니다.");
      }
    }
  }
}
