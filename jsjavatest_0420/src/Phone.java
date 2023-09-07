import java.util.Scanner;

public class Phone {
  private String name;
  private String tel;

  public Phone(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }

  public String getName() {
    return name;
  }

  public String getTel() {
    return tel;
  }
}

class PhoneEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("이름과 전화번호 입력 >> ");
    String name1 = sc.next();
    String num1 = sc.next();

    System.out.print("이름과 전화번호 입력 >> ");
    String name2 = sc.next();
    String num2 = sc.next();

    Phone p1 = new Phone(name1, num1);
    System.out.println(p1.getName() + "의 번호 " + p1.getTel());

    Phone p2 = new Phone(name2, num2);
    System.out.print(p2.getName() + "의 번호 " + p2.getTel());
  }
}