package quiz05;

import java.util.Scanner;

public class StackClassEx {
  public static void main(String[] args) {
    StringStack stack = new StringStack(10);
    Scanner sc = new Scanner(System. in);

    System.out.println(">> ");

    for (int i = 0; i < 5; i++) {
      String text = sc.next();
      // StringStack 클래스 타입의 객체 stack의 메소드 push를 사용하여 입력받은 데이터를 저장
      stack.push(text);
    }

    // StringStack 클래스 타입의 객체 stack의 메소드 length()를 사용하여 스택 구조의 배열에 저장된 데이터의 크기를 가져옴
    int count = stack.length();

    for (int i = 0; i < count; i++) {
      // StringStack 클래스 타입의 객체 stack의 메소드 pop()을
      System.out.print(stack.pop() + " ");
    }
  }
}
