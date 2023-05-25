package gof.designpatterns.singleton.multithreadsafe.crash2;

import java.io.Serializable;

public class Settings implements Serializable {

  private Settings() {}

  private static class SettingHolder {
    public static final Settings INSTANCE = new Settings();
  }

  public static Settings getInstance() {
    return SettingHolder.INSTANCE;
  }

  /**
   * 역직렬화 대응 방안
   * 해당 시그니처를 가지고 있으면 해당 메소드를 사용한다.
   * (오버라이드를 하지 않았는데 어떻게..?)
   */
  protected Object readResolve() {
    return getInstance();
  }

}
