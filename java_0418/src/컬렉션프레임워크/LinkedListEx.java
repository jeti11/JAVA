package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
  // LinkedList가 속도 면에서 ArrayList 보다 빠름(데이터를 추가하거나 삭제하는 실행에서)
  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new LinkedList<>();

    long startTime;
    long endTime;

    startTime = System.nanoTime();

    for (int i = 0; i < 100000; i++) {
      list1.add(0, String.valueOf(i));
    }

    endTime = System.nanoTime();
    System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime)+ " ns");

    startTime = System.nanoTime();

    for (int i = 0; i < 100000; i++ ){
      list2.add(0, String.valueOf(i));
    }

    endTime = System.nanoTime();
    System.out.println("ArrayList 걸린 시간 : " + (endTime - startTime)+ " ns");

  }

}
