import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeOrder {
  public static void main(String[] args) throws Exception {
    Map<String, Integer> coffee = new HashMap<>();
    coffee.put("에스프레소", 2000);
    coffee.put("아메리카노", 2500);
    coffee.put("카푸치노", 3000);
    coffee.put("카페라떼", 3500);

    Scanner sc = new Scanner(System.in);
    System.out.print("커피 주문하세요 >> ");
    String name = sc.next();
    int num = sc.nextInt();

    if (name.equals("에스프레소")) {
      System.out.println(coffee.get("에스프레소") * num + "원 입니다.");
    }
    else if (name.equals("아메리카노")) {
      System.out.println(coffee.get("아메리카노") * num + "원 입니다.");
    }
    else if (name.equals("카푸치노")) {
      System.out.println(coffee.get("카푸치노") * num + "원 입니다.");
    }
    else if (name.equals("카페라떼")) {
      System.out.println(coffee.get("카페라떼") * num + "원 입니다.");
    }
  }
}
