// 부모 클래스인 People 클래스를 상속받아 People 클래스가 가지고 있는 멤버인 필드 name, ssn을 Student 클래스에서 사용할 수 있음
public class Student extends People {
  public int studentNo;
  // super(name, ssn)을 통해 아래와 같은 필드값으로 초기화됨
//  public String name = "유재석";
//  public String ssn = "9876~";
  public Student(String name, String ssn, int studentNo) {
    // this. : 객체 자신을 호출하는 명령어
    // this() : 객체 자신의 다른 생성자를 호출하는 명령어
    // super. : 부모의 객체를 호출하는 명령어, 부모의 필드 및 메소드를 사용할 경우 사용함

    // super() : 부모의 생성자를 호출하는 명령어
    // 자식 클래스의 생성자에서 부모 객체의 생성자를 호출하기 위해서 사용함.
    // 매개변수가 없는 super()는 컴파일러가 자동으로 호출하는 부모 생성자 이므로 생략이 가능
    // 부모 클래스에 기본 생성자가 없을 경우 super(매개변수) 형태로 반드시 입력해야 함
    // super()는 반드시 자식 생성자의 첫번째 줄에 입력해야 함(초기화 작업을 부모먼저 해주고 난 뒤에 자식 것을 해주기 때문)
    super(name, ssn);
    this.studentNo = studentNo;

  }
  // 아래 필드가 보이지는 않지만, 상속받음으로써 필드가 만들어져있다.
//  public String name;
//  public String ssn;
}

// 오버라이딩 : 부모 클래스에서 상속받은 메소드의 내용 수정
// 조건
// 부모 클래스 메소드의 반환값, 메소들이름, 매개변수(개수, 타입, 순서) 똑같아야 함
// public 접근제한자 설정된 메소드만 가능