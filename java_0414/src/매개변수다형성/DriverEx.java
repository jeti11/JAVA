package 매개변수다형성;

public class DriverEx {
  public static void main(String[] args) {
    Driver d = new Driver();

    Bus b = new Bus();
    Taxi t = new Taxi();

    d.drive(b);
    d.drive(t);
  }
}
