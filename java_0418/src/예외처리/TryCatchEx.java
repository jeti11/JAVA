package 예외처리;

public class TryCatchEx {
  public static void main(String[] args) {
    try {
      // forName : 클래스이름을 확인하여 존재하는 클래스인지 파악하는 메소드
      Class clazz = Class.forName("java.lang.String");
      System.out.println("클래스가 존재합니다.");
    }
    catch (Exception e) {
      System.out.println("클래스가 존재하지 않습니다.");
    }
    System.out.println("\n------ 프로그램 종료 -------\n");
  }
}
