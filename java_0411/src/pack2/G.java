package pack2;
import pack1.E;

public class G {
  
  // E(boolean) 생성자는 접근제한자가 public로 설정되어 있어 접근에 제한이 없음
  E e1 = new E(true);
  
  // E(int)생성자는 접근제한자가 default로 설정되어 있어 다른 패키지에서 접근이 불가능함
//  E e2 = new E(1);
  
  // E(String) 생성자는 접근제한자가 private로 설정되어 있어 클래스 외부에서 접근이 불가능함
//  E e3 = new E("문자열");
}
