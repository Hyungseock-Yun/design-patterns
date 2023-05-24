package gof.designpatterns.singleton.multithreadsafe.safe1;

public class App {
  public static void main(String[] args) {
    Settings settings = Settings.getInstance();
    Settings settings1 = Settings.getInstance();

    System.out.println(settings != settings1);
  }
}
