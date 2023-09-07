public class Calculator5 {
  // 정적(static) 멤버 : 클래스의 멤버로 동작하는 필드와 메소드
  // 객체 생성하지 않고 클래스의 이름을 통해서 필드와 메소드에 접근이 가능
  // 정적 멤버는 클래스를 통해서 접근 (객체를 통해 접근도 가능하긴 하나 바람직하지 못함)
  // 정적 멤버는 클래스 안에서 데이터를 공유
  // 클래스명.멤버명 으로 접근
  // 일반 인스턴스 멤버는 정적 멤버를 사용할 수 있음
  // 정적멤버는 일반 인스턴스 멤버를 사용할 수 없음 (정적 멤버 호출 시 해당 객체가 없을 수 있음)


  

  public int num1 = 10;
  public int num2 = 20;
  public int result = 0;

  public static int staticNum1 = 10;
  public static int staticNum2 = 20;
  public static int staticResult = 0;

  public void sum() {
    result = num1 + num2;
    System.out.println("두 수의 덧셈은 " + result + "입니다.");
  }

  public void setNumber(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
    this.result = 0;
  }

  public static void staticSum() {
    staticResult = staticNum1 + staticNum2;
    System.out.println("두 수의 덧셈은 " + staticResult + "입니다.");
  }

  public static void setStaticNumber(int staticNum1, int staticNum2) {
    Calculator5.staticNum1 = staticNum1;
    Calculator5.staticNum2 = staticNum2;
    Calculator5.staticResult = 0;
  }
}
