import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {
  public static void main(String[] args) {

    // 부모인 Map 인터페이스 타입의 변수에 자식 클래스인 Hashtable 객체를 대입
    // HashMap 타입과 사용법이 같음
    Map<String, String> map = new Hashtable<>();
    
    // 데이터 추가
    map.put("spring", "12");
    map.put("summer", "123");
    map.put("fall", "1234");
    map.put("winter", "12345");

    Scanner sc = new Scanner(System.in);

    // 로그인 메뉴 출력을 위해서 무한 반복
    while (true) {
      System.out.println("아이디와 비밀번호를 입력하세요");
      System.out.print("아이디 : " );
      String id = sc.nextLine();

      System.out.print("비밀번호 : ");
      String password = sc.nextLine();
      System.out.println();

      // 사용자가 입력한 키가 Hashtable에 저장되어 있는지 확인
      if (map.containsKey(id)) {
        // 입력한 키와 1:1로 연동되어 있는 값을 가져와서 사용자가 입력한 비밀번호와 같은지 확인
        if (map.get(id).equals(password)) {
          System.out.println("로그인 되었습니다.");
          break;
        }
        else {
          System.out.println("비밀번호가 일치하지 않습니다.");
        }
      }
      else {
        System.out.println("입력하신 아이디가 존재하지 않습니다.");
      }
    }
  }
}
