public class Calculator3 {
  // 메소드 오버로딩 사용
  // 메소드 이름 하나가지고 데이터타입만 다른 경우에 사용가능
  public void sum(int x, int y) {
    int result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sum(int x, double y) { // 위와 매개변수 타입 다름
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sum(double x, int y) { // 위와 메개변수 순서 다름
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sum(double x, double y) { // 맨 위와 매개변수 타입 다름
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

}
