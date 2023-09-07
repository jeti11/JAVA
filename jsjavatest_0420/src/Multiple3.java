import java.util.Scanner;

public class Multiple3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] array = new int[10];
    int num;
    System.out.print("정수 10개 입력 >> ");

    for (int i = 0; i < array.length; i++) {
      num = sc.nextInt();
      array[i] = num;
    }

    System.out.print("3의 정수 >> ");
    for (int j = 0; j < 10; j++) {
      if ((array[j] % 3 == 0)) {
        System.out.print(array[j] + " ");
      }
    }
  }
}
