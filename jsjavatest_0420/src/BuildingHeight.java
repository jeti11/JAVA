import java.util.Scanner;

public class BuildingHeight {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("몇 층인지 입력하세요 >> ");
    int floor = sc.nextInt();
    int result = floor * 5;
    System.out.println(result + "m 입니다.");
  }
}
