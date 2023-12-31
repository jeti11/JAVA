package 컬렉션프레임워크;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
  // Map 컬렉션
  // key와 value로 객체를 저장하는 구조
  // key는 중복 불가, value는 중복 가능

  // put
  // get
  // size
  // remove
  // 위 4가지 중요
  // set
  // containsKey()
  // containsValue()
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();

    map.put("아이유", 85);
    map.put("유인나", 90);
    map.put("유재석", 80);
    map.put("유병재", 95);
    System.out.println("총 Entry 수 : " + map.size());

    System.out.println("\t 유인나 : " + map.get("유인나"));
    System.out.println();

    Set<String> keyset = map.keySet();
    Iterator<String> keyIter = keyset.iterator();

    while (keyIter.hasNext()) {
      String key = keyIter.next();
      Integer value = map.get(key);
      System.out.println("\t " + key + " : " + value);
    }
    System.out.println();

    map.remove("유병재");
    System.out.println("총 Entry 수 : " + map.size());

    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
    Iterator<Map.Entry<String, Integer>> entryIter = entrySet.iterator();

    while (entryIter.hasNext()) {
      Map.Entry<String, Integer> entry = entryIter.next();
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("\t " + key + " : " + value);
    }
    
    System.out.println();
    
    map.clear();
    System.out.println("비어있음");
  }
}
