package 제네릭;

import java.io.PrintStream;

public class BoxEx {
  public static void main(String[] args) {
    Box box = new Box();
    box.setData("유재석");
//    String name = box.getData(); // 안에 들어가있는 데이터가 Object 타입임
    // Object 타입은 자바의 최상위 클래스
    String name = (String) box.getData();

    System.out.println(name);

    box.setData(100);
    int num = (int) box.getData();
    System.out.println(num);

    box.setData(new Apple());
    Apple apple = (Apple) box.getData();

    System.out.println("--- 제네릭 사용시 ---");

    Box2<String> box2 = new Box2<String>();
    box2.setData("아이유");
    String name2 = box2.getData();
    System.out.println(name2);

    Box2<Integer> box3 = new Box2<Integer>();
    box3.setData(100);
    int num3 = box3.getData();
    System.out.println(num3);

  }
}
