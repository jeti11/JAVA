package quiz05;


public class StringStack extends StackClass {

  private String[] stack;  // 스택 구조로 사용할 배열
  private int count;  // 스택에 쌓여있는 데이터의 크기(높이)

  // 생성자, 객체 생성 시 매개변수로 스택의 크기를 결정
  public StringStack(int index) {
    stack = new String[index]; // 스택 크기 지정
    count = 0; // 스택 높이 0으로 초기화
  }
  
  @Override // 스택에 저장된 데이터의 마지막 위치를 출력
  int length() {
    return count;
  }

  @Override // 스택에 저장된 가장 마지막 데이터를 출력
  String pop() {
    if (count == 0) { // 0일 경우 저장된 데이터가 없음
      return null;
    }
    count--;
    return stack[count];
  }

  @Override // 스택의 마지막 위치에 데이터를 저장
  // 스택의 최대 크기에 도달 시 더이상 데이터를 쌓을 수 없음(false)
  boolean push(String ob) {
    // 스택의 높이와 스택 구조로 사용하는 배열의 크기가 같으면 더이상 데이터를 추가할 수 없으므로 false를 출력
    if (count == stack.length) {
      return false;
    }
    else {
      // 스택 구조로 사용하는 배열에 데이터를 추가
      stack[count++] = ob;
      return true; // 정상적으로 데이터를 저장했다는 의미로 true 출력
    }
  }
}
