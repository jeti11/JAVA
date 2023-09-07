package quiz;

public class Box {
  private int width;
  private int height;
  private char fllchar;

  public Box() {
    this(10, 1);
  }

  public Box(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public void draw() {
    for(int i = 0; i < height; i++) {
      for(int j = 0; j < width; j++) {
        System.out.print(this.fllchar);
      }
      System.out.println(); // 줄바꿈
    }
  }

  public void fll(char c) {
    this.fllchar = c;
  }

  public static void main(String[] args) {
    Box a = new Box();
    Box b = new Box(20, 3);
    a.fll('*');
    b.fll('%');
    a.draw();
    b.draw();
  }
}
