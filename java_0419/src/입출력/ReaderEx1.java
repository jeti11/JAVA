package 입출력;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx1 {
  public static void main(String[] args) throws Exception {
    // 문자 입력 스트림의 최상위 클래스인 Reader 클래스 타입의 변수 reader에 자식 클래스인 FrileReader 객체를 저장함
    Reader reader = new FileReader("c:\\smart505\\git hub 토큰_03.10.txt");

    int readData; // 데이터를 저장할 변수 선언

    while (true) {
      // 파일에서 문자 1자를 가져와 readData에 저장
      readData = reader.read();

      if (readData == -1) {
        break;
      }
      System.out.print((char) readData);
    }
    reader.close();
  }
}
