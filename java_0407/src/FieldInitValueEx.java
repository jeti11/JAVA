public class FieldInitValueEx {
  public static void main(String[] args) {
    FieldInitValue fiv = new FieldInitValue();

    System.out.println("byteField : " + fiv.byteField);
    System.out.println("shortField : " + fiv.shortField);
    System.out.println("intField : " + fiv.intField);
    System.out.println("longField : " + fiv.longField);

    System.out.println("booleanField : " + fiv.booleanField);
    System.out.println("charField : " + fiv.charField); // 빈문자, 정확하게는 '\0'

    System.out.println("floatField : " + fiv.floatField);
    System.out.println("doubleField : " + fiv.doubleField);

    System.out.println("intArrField : " + fiv.intArrField);
    System.out.println("stringField : " + fiv.stringField);

  }
}
