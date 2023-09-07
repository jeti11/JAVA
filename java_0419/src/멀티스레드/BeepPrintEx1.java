package 멀티스레드;

import java.awt.*;

public class BeepPrintEx1 {
  public static void main(String[] args) {
    // 싱글 스레드로 프로그램을 동작했을 경우
    Toolkit toolkit = Toolkit.getDefaultToolkit();

    for (int i = 0; i < 5; i++ ){
      toolkit.beep(); // 윈도우의 띵 소리 출력
      try {
        Thread.sleep(500); // 0.5초마다
      }
      catch (Exception e) {

      }
    }

    for (int i = 0; i < 5; i++) {
      System.out.println("띵");
      try {
        Thread.sleep(500);
      }
      catch (Exception e) {

      }
    }
  }
}
