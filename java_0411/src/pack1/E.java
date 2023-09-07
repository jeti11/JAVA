package pack1;

public class E {
  E e1 = new E(true);
  E e2 = new E(1);
  E e3 = new E("문자열");


  // 접근제한자 public을 지정한 생성자
  public E(boolean b) {

  }
  // 접근제한자 default을 지정한 생성자
  E(int e) {

  }
  // 접근제한자 private을 지정한 생성자
  private E(String e) {

  }
}
