package quiz03;

public class Adder extends Calculator {

  @Override
  protected int calc() {
    int result = a + b;
    return result;
  }
}
