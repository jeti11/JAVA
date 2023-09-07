import java.util.Scanner;

public class Quiz {
  // 실습문제 2번
  public static void quiz01() {
    System.out.println("------ 실습문제 2번 -------");
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 10개 입력 : ");


    int[] numArray = new int[10];

    for (int i = 0; i < 10; i++) {
      int num = sc.nextInt();
      numArray[i] = num; // -> numArray[i] = sc.nextInt(); 로 해도됨
      if (numArray[i] % 3 == 0) {
        System.out.println(numArray[i]);
      }
    }
  }


  public static void quiz02() {
    System.out.println("------ 실습문제 5번 -------");
//    17 3 9 -6 77 234 5 23 -3 1
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 10개 입력 : ");

    int[] numArr = new int[10];
    for (int i = 0; i < 10; i++) {
      int num = sc.nextInt();
      numArr[i] = num;
      System.out.println(numArr[i] + " ");
    }
  }


  public static void quiz03() {
    System.out.println("------ 실습문제 6번 -------");
    String[] eng = {"student", "love", "java", "happy", "future"};
    String[] kor = {"학생", "사랑", "자바", "행복한", "미래"};
    Scanner sc = new Scanner(System.in);




    for (int i = 0; i < 50; i++) {
      System.out.print("영어 단어를 입력하세요 : ");
      String word = sc.next();
      for (int j = 0; j < eng.length; j++) {
        if (word.equals(eng[j])) {
          System.out.println(kor[j]);
        }
      }
    }





  }


  public static void quiz04() {
    System.out.println("------ 실습문제 7번 -------");
    for (int i = 1; i < 100; i++) {
      int first = i / 10;
      int second = i % 10;
      if ((first % 3 == 0) && (second % 3 == 0)) {
        System.out.println(i + " 박수 두번");
      }
      else if ((first % 3 == 0) || (second % 3 == 0)) {
        System.out.println(i + " 박수 한번");
      }
    }

  }


  public static void quiz05() {
    System.out.println("------ 실습문제 8번 -------");

  }

  public static void main(String[] args) {
    quiz04();
  }



}

































