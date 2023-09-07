package quiz;

import java.util.Scanner;

public class RectEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Rect[] rects = new Rect[4];

    for (int i = 0; i < rects.length; i++) {
      System.out.print((i + 1) + " 너비와 높이 >> ");
      int width = sc.nextInt();
      int height = sc.nextInt();

      rects[i] = new Rect(width, height);
    }

    System.out.println("저장하였습니다...");

    int total = 0;
    for (int i = 0; i < rects.length; i++) {
      total += rects[i].getArea();
    }
    System.out.println("사각형의 전체 합은 " + total);
  }
}
