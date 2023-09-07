import static java.sql.DriverManager.println;

public class Calculator2 {
  int plus(int x, int y) {
    int result = x + y;
    return result;
  }

  double avg(int x, int y) {
    // plus()메소드는 동일한 클래스의 멤버이므로 이름으로만 호출이 가능
    // 자동타입변환에 의해서 plus() 메소드의 반환값이 double타입의 변수 sum에 저장
    double sum = plus(x, y);
    // 큰 데이터 타입과 작은 데이터 타입을 연산 시 큰 데이터 타입으로 자동타입변환이 발생함
    double result = sum / 2;
    return result;
  }

  void execute() {
    // avg() 메소드를 직접 호출해서 사용
    // 동일한 클래스의 멤버이므로 메소드의 이름으로만 호출이 가능
    double result = avg(7, 10);
    println("실행 결과 : " + result);
  }

  void println(String message) { // 객체지향이기 때문에 메소드가 아래에 있어도 상관이 없음
    System.out.println(message);
  }


}
