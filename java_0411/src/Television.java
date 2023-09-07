public class Television {

  public static String company = "SAMSUNG";
  public static String model = "LED";
  public static String info;

  // 정적 초기화 블록 : 정적멤버용 생성자
  // 정적 멤버 끼리만 사용 (인스턴스 멤버는 사용불가)
  static {
    info = company + " - " + model; // 정적 초기화 블록을 통해 String info의 값을 초기화함
  }
}
