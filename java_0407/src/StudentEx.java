public class StudentEx {
  public static void main(String[] args) {

    Student s1 = new Student(); // 객체의 생성
    System.out.println("Student 클래스 타입의 변수 s1이 Student 클래스 타입의 객체를 참조합니다.");

    Student s2; // s2 : Student(class) 타입의 변수, (데이터 = null)
    s2 = new Student(); // new Student() 를 통해 메모리에 객체 생성 후 주소를 s2로 넘겨줌 --> s2는 객체
    System.out.println("Student 클래스 타입의 변수 s2가 Student 클래스 타입의 객체를 참조합니다.");
  }
}
