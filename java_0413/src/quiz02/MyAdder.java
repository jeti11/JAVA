package quiz02;

public class MyAdder extends AdderClass {
  int add(int x, int y) {
    return x + y;
  }

  int add(int n) {
    int total = 0;
    for (int i = 1; i <= n; i++) {
      total = total + i;
    }
    return total;
  }
}
