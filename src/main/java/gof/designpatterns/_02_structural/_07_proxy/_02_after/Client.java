package gof.designpatterns._02_structural._07_proxy._02_after;

public class Client {

  public static void main(String[] args) {
    GameService gameService = new GameServiceProxy(new DefaultGameService());
    gameService.startGame();
  }

}
