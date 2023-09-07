public class FloatDoubleEx {
  public static void main(String[] args){
    // 큰 데이터 타입의 데이터를 작은 데이터 타입의 변수에 저장할 수 없음(반대는 가능)
    double var1 = 3.14; // 실수의 기본 데이터 타입인 double 타입
//    float var2 = 3.14; // double타입의 데이터 3.14를 float 타입의 변수 var2에 저장하고자 하기 때문에 오류가 발생
    float var3 = 3.14F;

    // double 타입은 소수점 18번째 자리까지 표현, 19번째 자리에서 반올림
    double var4 = 0.1234567890123456789;
    // float 타입은 소수점 8번째 자리까지 표현, 9번째 자리에서 반올림
    float var5 = 0.1234567890123456789F;

    System.out.println("var 1 : " + var1);
//    System.out.println("var 2 : " + var2);
    System.out.println("var 3 : " + var3);
    System.out.println("var 4 : " + var4);
    System.out.println("var 5 : " + var5);

    int var6 = 3000000;
    double var7 = 3e6;
    float var8 = 3e6F;
    double var9 = 2e-3; // 2 * 10의 -3승

    System.out.println("var 6 : " + var6);
    System.out.println("var 7 : " + var7);
    System.out.println("var 8 : " + var8);
    System.out.println("var 9 : " + var9);

  }
}
