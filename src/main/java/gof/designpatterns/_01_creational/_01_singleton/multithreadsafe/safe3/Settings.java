package gof.designpatterns._01_creational._01_singleton.multithreadsafe.safe3;

public class Settings {

  private Settings() {}

  private static class SettingHolder {
    public static final Settings INSTANCE = new Settings();
  }

  public static Settings getInstance() {
    return SettingHolder.INSTANCE;
  }

}
