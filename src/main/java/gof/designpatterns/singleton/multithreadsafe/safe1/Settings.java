package gof.designpatterns.singleton.multithreadsafe.safe1;

public class Settings {

  private static Settings instance;

  private Settings() {}

  /**
   * synchronized를 사용하여 동기화 한다.
   * 그러나 여기에는 동기화 시 성능이 감소할 수 있다는 불이익이 존재.
   */
  public static synchronized Settings getInstance() {
    if (instance == null) instance = new Settings();

    return instance;
  }

}
