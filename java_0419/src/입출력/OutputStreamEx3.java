package 입출력;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx3 {
  public static void main(String[] args) throws Exception {
    OutputStream os = new FileOutputStream("C:\\smart505\\outputfile3.txt");

    byte[] bytes = "ABCDEFGHIJKLMNOP".getBytes();

    os.write(bytes, 5, 10);
    os.flush();
    os.close();

  }
}
