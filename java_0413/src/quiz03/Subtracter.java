package quiz03;

public class Subtracter extends Calculator {
  @Override
  protected int calc() {
    int result = a - b;
    return result;
  }
}
