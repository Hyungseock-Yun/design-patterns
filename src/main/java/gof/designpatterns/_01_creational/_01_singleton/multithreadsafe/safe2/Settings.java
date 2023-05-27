package gof.designpatterns._01_creational._01_singleton.multithreadsafe.safe2;

public class Settings {

  private static volatile Settings instance;

  private Settings() {}

  /**
   * 이른 초기화(eager initialization) 사용
   */
  public static  Settings getInstance() {
    /**
     * double checked locking 사용
     * 인스턴스가 있는 경우에는 synchronized를 거치지 않으므로 성능에 더욱 유리
     */
    if (instance == null) {
      synchronized (Settings.class) {
        if (instance == null) {
          instance = new Settings();
        }
      }
    }

    return instance;
  }

}
