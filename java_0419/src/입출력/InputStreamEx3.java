package 입출력;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx3 {
  public static void main(String[] args) throws Exception {
    InputStream is = new FileInputStream("C:\\smart505\\git hub 토큰_03.10.txt");
    int readData;
    byte[] readBytes = new byte[8];
    readData = is.read(readBytes, 2, 3); // 2번 인덱스 부터 3개 읽어온다.

    for (int i = 0; i < readBytes.length; i++) {
      System.out.println(readBytes[i] + " : " + (char)readBytes[i]);
    }

    is.close();
  }
}
