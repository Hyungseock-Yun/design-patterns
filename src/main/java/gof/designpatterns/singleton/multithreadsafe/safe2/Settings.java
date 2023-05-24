package gof.designpatterns.singleton.multithreadsafe.safe2;

public class Settings {

  private static final Settings INSTANCE = new Settings();

  private Settings() {}

  /**
   * 이른 초기화(eager initialization) 사용
   */
  public static  Settings getInstance() {
    return INSTANCE;
  }

}
