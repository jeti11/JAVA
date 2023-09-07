package 입출력;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx2 {
  public static void main(String[] args) throws Exception {
    // FileInputStream을 통해서 파일 정보를 가져옴
    InputStream is = new FileInputStream("C:\\smart505\\git hub 토큰_03.10.txt");
    int readData; // 읽어올 데이터를 저장할 변수 선언

    byte[] readBytes = new byte[3]; // 버퍼로 사용할 byte 배열
    String data = ""; // 실제 문자가 저장될 변수

    while (true) {
      // 매개변수로 사용된 byte 배열의 크기만큼 스트림에서 데이터를 읽어옴, 실행 후 가져온 byte 수 출력
      readData = is.read(readBytes);

      if (readData == -1) { // read() 사용 후 읽을 데이터가 없으면 -1을 반환
        break;
      }
      // 파일에서 한번에 읽어온 byte 배열을 읽어온 크기만큼 문자열로 변환
      // 변환된 문자열을 기존 문자열 뒤에 추가함
      data += new String(readBytes, 0, readData);
    }
    System.out.println(data);
    is.close(); // 파일 닫기
  }
}
