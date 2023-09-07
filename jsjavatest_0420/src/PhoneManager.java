import java.util.Scanner;

public class PhoneManager {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    String name;
    String num;
    Phone phone;

    System.out.print("인원수 >> ");
    count = sc.nextInt();
    Phone[] phoneArray = new Phone[count];

    for (int i = 0; i < count; i++) {
      System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");
      name = sc.next();
      num = sc.next();

      phone = new Phone(name, num);
      phoneArray[i] = phone;
    }
    System.out.println("저장되었습니다..");

    while (true) {
      System.out.print("검색할 이름 >> ");
      String searchName = sc.next();
      if (searchName.equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }
      else {
        for (int i = 0; i < phoneArray.length; i++) {
          if (searchName.equals(phoneArray[i].getName())) {
            System.out.println(searchName + "의 번호는 " + phoneArray[i].getTel());
          }
          else if (!searchName.equals(phoneArray[i].getName())){
            System.out.println(searchName + "은 없습니다.");
          }

        }
      }
    }
  }
}
