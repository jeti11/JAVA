public class ComputerEx {
  public static void main(String[] args) {
    int r = 10;

    Calculator cal = new Calculator();
    System.out.println("원면적 : " + cal.areaCircle(r));

    System.out.println("--------- ----------");

    Computer com = new Computer();
    // 오버라이딩 된 메소드가 실행됨
    System.out.println("원면적 : " + com.areaCircle(r));

    System.out.println("--------- ----------");

// @Override 어노테이션 : 해당 메소드가 재정의된 메소드임을 나타내는 명령어
// 컴파일러에게 해당 메소드가 재정의된 메소드임을 알려줘서 혹시라도 발생할 수 있는 오류를 줄임
    com.sum(10 , 20);
    com.sum(10, 20);

  }
}
