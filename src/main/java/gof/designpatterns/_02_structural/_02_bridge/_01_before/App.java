package gof.designpatterns._02_structural._02_bridge._01_before;

public class App {

  public static void main(String[] args) {
    Champion kda아리 = new KDA아리();
    kda아리.move();
    kda아리.skillQ();
    kda아리.skillE();
  }
}
