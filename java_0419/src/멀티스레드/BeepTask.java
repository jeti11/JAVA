package 멀티스레드;

import java.awt.*;

public class BeepTask implements Runnable{

  @Override
  public void run() {
    Toolkit toolkit = Toolkit.getDefaultToolkit();

    for (int i = 0; i < 5; i++) {
      toolkit.beep();
      try {
        Thread.sleep(500); // 현재 스레드의 동작을 지정한 시간(1/1000초)동안 멈춤
      }
      catch (Exception e) {

      }
    }
  }
}
