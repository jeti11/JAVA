public class Earth {
  // 상수 (static final)

  static final double EARTH_RADIUS = 6400; // final static으로 해도 됨
  static final double EARTH_SURFACE_AREA; //초기값을 지정해놓지 않음

  static {
    EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; //정적 초기화 필드를 통해 초기값을 지정
  }
}
