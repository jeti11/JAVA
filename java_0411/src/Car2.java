public class Car2 {

  // 접근제한자를 private으로 설정하여 외부에서 직접 접근을 제한함
  // 아래의 필드는 해당 클래스 내부에서만 사용할 수 있음
  private int speed;
  private boolean stop;


  // 캡슐화 방법(간편화)
  // 1. 캡슐화 할 필드를 드래그 한 후 오른쪽 클릭
  // 2. 메뉴의 코드 - 생성 - getter 및 setter
  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public boolean isStop() {
    return stop;
  }

  public void setStop(boolean stop) {
    this.stop = stop;
  }



//  public int getSpeed() {
//    return speed;
//  }
//
//  public void setSpeed(int speed) {
//    this.speed = speed;
//  }
//
//  public boolean isStop() {
//    return stop;
//  }
//
//  public void setStop(boolean stop) {
//    this.stop = stop;
//  }


  // getter/setter를 사용하여 필드에 대한 우회접근을 가능하도록 함
//  public int getSpeed() {
//    return speed;
//  }
//
//  // setSpeed() 메소드는 접근제한자가 public이기 때문에 외부에서 사용이 가능함
//  public void setSpeed(int speed) {
//    // 메소드 내부에서 매개변수의 데이터를 검증할 수 있음
//    if (speed < 0) {
//      this.speed = 0;
//    }
//    else {
//      this.speed = speed; // 정상적인 데이터만 필드에 저장(검증)
//    }
//  }
//
//  public boolean isStop() {
//    return stop;
//  }
//
//  // 매개변수로 넘어온 데이터를 바탕으로 여러가지 필드를 동시에 수정이 가능함
//  public void setStop(boolean stop) {
//    this.stop = stop;
//    this.speed = 0;
  }

