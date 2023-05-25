package gof.designpatterns.singleton.multithreadsafe.safe3;

public class Settings {

  private Settings() {}

  private static class SettingHolder {
    public static final Settings INSTANCE = new Settings();
  }

  private static Settings getInstance() {
    return SettingHolder.INSTANCE;
  }

}
