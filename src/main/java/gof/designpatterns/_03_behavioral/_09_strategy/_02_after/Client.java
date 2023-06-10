package gof.designpatterns._03_behavioral._09_strategy._02_after;

public class Client {

  public static void main(String[] args) {
//    BlueLightRedLight game = new BlueLightRedLight(new Normal());
//    game.blueLight();
//    game.redLight();

    BlueLightRedLight game = new BlueLightRedLight();
    game.blueLight(new Normal());
    game.redLight(new Fastest());
  }
}
