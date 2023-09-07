package 입출력;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx1 {
  public static void main(String[] args) throws Exception {
    Writer writer = new FileWriter("c:\\smart505\\writer1.txt");

    char[] data = "유재석".toCharArray();

    for (int i = 0; i < data.length; i++) {
      writer.write(data[i]);
    }

    writer.flush();
    writer.close();
  }
}
