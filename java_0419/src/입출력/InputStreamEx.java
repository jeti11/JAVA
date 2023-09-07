package 입출력;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx {
  public static void main(String[] args) throws Exception {
    // 부모 클래스인 InputStream이 추상 클래스이므로 자식 클래스인 FileInputStream이 상속받아 구현해야 함
    // 부모 클래스 타입의 변수 is에 자식클래스인 FileInputStream 객체를 생성하여 대입함
    InputStream is = new FileInputStream("C:\\smart505\\git hub 토큰_03.10.txt");

    // 데이터를 입력받기 위한 변수
    int readData;

    // 파일의 모든 내용을 출력하기 위한 반복문
    while (true) {
      // FileInputStream 객체의 read() 메소드를 통해서 파일에 있는 정보를 1byte 가져와 readData 변수에 대입
      readData = is.read();

      if (readData == -1) { // 더이상 읽어올 데이터가 없을 경우 -1을 출력함.
        break; // 반복문 종료
      }
      // 읽어온 데이터를 char 타입의 강제 타입 변환하여 화면 출력
      System.out.print((char)readData);
    }
    is.close(); // 열어놓은 InputStream을 닫기
  }
}
