package 입출력;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx3 {
  public static void main(String[] args) throws Exception {
    Writer writer = new FileWriter("c:\\smart505\\writer3.txt");

    String data = "문자열로 바로 파일에 쓰기";
    writer.write(data);

    writer.flush();
    writer.close();
  }
}
