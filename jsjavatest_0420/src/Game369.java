import java.util.Scanner;

public class Game369 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int first = 0;
    int second = 0;

    while (true) {
      System.out.print("1 ~ 99 사이의 정수를 입력하세요 >> ");
      int num = sc.nextInt();
      first = num / 10;
      second = num % 10;

      if (num != 0) {
        if ((first == 3) || (first == 6) || (first == 9)) {
          if ((second == 3) || (second == 6) || (second == 9)){
            System.out.println("박수짝짝");
          }
          else {
            System.out.println("박수짝");
          }
        }
        else {
          if ((second == 3) || (second == 6) || (second == 9)) {
            System.out.println("박수짝");
          }
          else {
            System.out.println("박수없음");
          }
        }
      }
      else {
        System.out.println("종료합니다.");
        break;
      }
    }
  }
}
