package 컬렉션프레임워크;

import com.sun.jdi.Value;

import java.sql.Array;
import java.util.*;

public class QuizEx {
  public static void quiz01() {
    Scanner sc = new Scanner(System.in);

    List<Double> list = new Vector<>();

    for (int i = 0; i < 5; i++) {
      double num = sc.nextDouble();
      list.add(num);
    }
    int size = list.size();
    double max = 0;
    for (int i = 0; i < size; i++) {
      if (list.get(i) > max) {
        max = list.get(i);
      }
    }
    System.out.println("가장 큰 수는 " + max);
  }

  public static void quiz02() {
    Scanner sc = new Scanner(System.in);
    System.out.println("빈 칸으로 분리하여 5개의 학점을 입력(A/B/C/D/F) >> " );

    double output;

    List<Character> list = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      char input = sc.next().charAt(0);
      list.add(input);

      if (list.get(i) == 'A') {
        System.out.println(4.0);
      }
      else if (list.get(i) == 'B') {
        System.out.println(3.0);
      }
      else if (list.get(i) == 'C') {
        System.out.println(2.0);
      }
      else if (list.get(i) == 'D') {
        System.out.println(1.0);
      }
      else {
        System.out.println(0.0);
      }
    }

  }

  public static void quiz03() {
    Map<String, Integer> map = new HashMap<>();
    map.put("에스프레소", 2000);
    map.put("아메리카노", 2500);
    map.put("카푸치노", 3000);
    map.put("카페라떼", 3500);

    Scanner sc = new Scanner(System.in);
    System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼가 있습니다.");
    while (true) {
      System.out.print("주문 >> ");
      String coffee = sc.next();

      if (coffee.equals("에스프레소")) {
        System.out.println("에스프레소는 " + map.get("에스프레소") + "원 입니다.");
      }
      else if (coffee.equals("아메리카노")) {
        System.out.println("아메리카노는 " + map.get("아메리카노") + "원 입니다.");
      }
      else if (coffee.equals("카푸치노")) {
        System.out.println("카푸치노는 " + map.get("카푸치노") + "원 입니다.");
      }
      else if (coffee.equals("카페라떼")) {
        System.out.println("카페라떼는 " + map.get("카페라떼") + "원 입니다.");
      }
      else if (coffee.equals("그만")) {
        System.out.println("종료");
        break;
      }
    }
  }

  public static void quiz04() {
    Scanner sc = new Scanner(System.in);
    double maxGrow = 0;
    int maxYear = 0;

    List<Integer> height = new Vector<>();
    List<Integer> grow = new Vector<>();
    List<Integer> year = new Vector<>();
    System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력\n>> ");

    for (int i = 0; i < 10; i++) {
      height.add(sc.nextInt());
    }

    for (int i = 0; i < 10; i++) {
      year.add(2000 + i);
    }

    for (int i = 0; i < 9; i++) {
      grow.add(i, height.get(i + 1) - height.get(i));
    }
    int size = grow.size();

    for (int i = 0; i < size; i++) {
      if (grow.get(i) > maxGrow) {
        maxGrow = grow.get(i);
        maxYear = year.get(i);
      }
    }
    System.out.println("가장 키가 많이 자란 년도는 " + maxYear + "년 " + maxGrow + "cm 입니다.");
  }

  public static void quiz05() {
    String nation = null;
    int people = 0;

    HashMap<String, Integer> nations = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("나라 이름과 인구를 5개 입력하세요.(예 : Korea 5000)");

    for (int i = 0; i < 5; i++) {
      System.out.print("나라 이름, 인구 >> ");
      nation = sc.next();
      people = sc.nextInt();
      nations.put(nation, people);
    }

//    Set<Map.Entry<String, Integer>> entrySet = nations.entrySet();
//    Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();
//
//    while (entryIter.hasNext()) {
//      Map.Entry<String, Integer> entry = entryIter.next();
//      String key = entry.getKey();
//      Integer value = entry.getValue();
//    }
//    for (Map.Entry maxPeople : entrySet) {
//      if (maxPeople.)
//    }

  }

  public static void main(String[]args) {
    quiz05();
  }
}


























