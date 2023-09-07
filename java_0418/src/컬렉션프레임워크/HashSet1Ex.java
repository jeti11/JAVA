package 컬렉션프레임워크;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1Ex {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();

    set.add("JAVA");
    set.add("JDBC");
    set.add("Servlet/JSP");
    set.add("JAVA"); // 중복 저장되지 않음
    set.add("mybatis");

    int size = set.size();
    System.out.println("총 크기 : " + size);

    // Iterator : 전체 객체를 하나씩 꺼내는 클래스
    Iterator<String> iter = set.iterator();

    // hasNext() : 지정한 객체 다음 데이터가 있는지 확인하는 메소드 (있으면 true, 없으면 false)
    while (iter.hasNext()) {
      String element = iter.next(); // 다음 데이터 가져오기
      System.out.println("\t" + element);
    }

    set.remove("mybatis");
    set.remove("JDBC");

    size = set.size();
    System.out.println("총 크기 : " + size);
    
    for (String element : set) {
      System.out.println("\t" + element);
    }
    
    set.clear();
    
    if (set.isEmpty()) {
      System.out.println("비어있음");
    }

  }
}
