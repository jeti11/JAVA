package quiz;

public class NamedCircle extends Circle {
  public String name;

  public NamedCircle(int radius, String name) {
    super(radius);
    this.name = name;
  }

  public void show() {
    System.out.println(name + ", 반지름 = " + getRadius());
  }

}
