package gof.designpatterns.singleton.multithreadsafe.crash1;

public class Settings {

  private Settings() {}

  private static class SettingHolder {
    public static final Settings INSTANCE = new Settings();
  }

  public static Settings getInstance() {
    return SettingHolder.INSTANCE;
  }

}