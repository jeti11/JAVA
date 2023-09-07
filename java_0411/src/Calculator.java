public class Calculator {
  // 메소드 오버로딩
  // 매개변수의 개수, 데이터타입, 순서 가 다를 경우, 똑같은 이름의 메소드를 여러개 생성할 수 있음
  double areaRectangle(double width) {
    return width * width;
  }

  double areaRectangle(double width, double height) {
    return width * height;
  }
}
