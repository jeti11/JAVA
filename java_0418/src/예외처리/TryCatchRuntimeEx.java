package 예외처리;

public class TryCatchRuntimeEx {
  public static void main(String[] args) {
    String data1 = null;
    String data2 = null;

    try { // args 배열타입 변수(프로그램인수) 아무것도 지정하지 않은 상태
      data1 = args[0];
      data2 = args[1];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("실행 매개값의 수가 부족합니다.");
      System.out.println("[실행 방법]");
      System.out.println("java 예외처리.TryCatchRuntimeEx  num1  num2");
      return;
    }

    try {
      int value1 = Integer.parseInt(data1); // 정수타입으로 변환하는 메소드
      int value2 = Integer.parseInt(data2);
      int result = value1 + value2;
      System.out.println(data1 + " + " + data2 + " = " + result);
    }
    catch (NumberFormatException e) {
      System.out.println("숫자로 변환할 수 없습니다.");
    }
    // finally : try ~ catch 구문에서 가장 마지막에 실행되는 코드블록
    // finally 코드블록은 오류가 발생하거나 발생하지 않거나 상관없이 무조건 실행되야 하는 소스코드를 입력하는 코드블록
    // 파일 및 네트워크와 같은 외부 리소스를 사용 시 자바에서 해당 외부리소스는 가비지 컬렉터가 메모리를 처리하지 않음 (사용자가 직접 메모리 해제를 해야 함)
    finally { // 무조건 실행
      System.out.println("다시 실행하세요 : ");
    }

    System.out.println("\n----- 프로그램 종료 -----\n");
  }
}
