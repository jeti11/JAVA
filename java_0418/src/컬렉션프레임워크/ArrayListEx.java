package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
  public static void main(String[] args) {
    // 컬렉션 프레임워크의 주요 인터페이스
    // List, Set, Map
    // 꼭 알아야 할 인터페이스 : ArrayList, Hashmap

    // ※ List 컬렉션의 특징
    // 인덱스로 관리
    // 중복해서 객체 저장 가능

    // ※ List 컬렉션의 주요메소드
    // add(int index, E element) : 해당 인덱스에 객체 추가
    // remove(int index) 해당 인덱스에 저장된 객체 삭제
    // int size() : 저장되어있는 전체 객체수 리턴(배열의 length와 유사)
    // set(index, E element) : 해당 인덱스의 객체 수정
    // get(int index) : 해당 인덱스에 저장된 객체 리턴

    // 빈 리스트 생성
    List<String> list = new ArrayList<>(); // 뒤의 <> 안의 String은 생략가능

    // 리스트에 데이터 추가
    list.add("Java");
    list.add("JDBC");
    list.add("Servlet/JSP");
    list.add(2, "Database");
    list.add("mybatis");

    int size = list.size();
    System.out.println("리스트의 총 크기 : " + size);
    System.out.println();

    String skill = list.get(2);
    System.out.println("2번 위치 : " + skill);
    System.out.println();

    for (int i = 0; i < size; i++) {
      String str = list.get(i);
      System.out.println(i + " : " + str);
    }

    System.out.println();

    list.remove(2);
    list.remove(2);
    list.remove("mybatis");

    for (int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      System.out.println(i + " : " + str);
    }

    System.out.println("\n--------------\n");

    System.out.println("배열을 리스트로 변경");

    // asList(배열) : Arrays 클래스에서 제공하는 배열을 ArrayList로 변환하는 메소드

    List<String> list1 = Arrays.asList("아이유", "유재석", "유병재");

    for (String name : list1) {
      System.out.println(name);
    }
    // 리스트로 변경 시 기본 데이터 타입을 사용하면 오류가 발생함
    // <>안에 기본 데이터타입의 래퍼 클래스 타입을 사용함

    List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
    for (int value : list2) {
      System.out.println(value);
    }

    String[] arrStr = {"JAVA", "JSP", "Spring"};
    List list3 = Arrays.asList(arrStr);
    for (int i = 0; i < list3.size(); i++) {
      System.out.println(list3.get(i));
    }
    System.out.println("\n 리스트를 배열로 변경\n");
    // 배열은 크기가 고정되어있기 때문에 리스트의 크기로 배열의 크기를 지정해서 배열을 생성
    // toArray() : ArrayList 클래스에서 제공하는 ArrayList를 배열로 변환하는 메소드

    String[] arrStr2 = new String[list3.size()];
    list3.toArray(arrStr2);
    for (int i = 0; i < arrStr2.length; i++) {
      System.out.println(arrStr2[i]);
    }
  }
}





























